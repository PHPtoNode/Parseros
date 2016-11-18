import java.util.*;
import java.io.PrintWriter;

public class MyVisitor<T> extends PHPParserBaseVisitor<T> {

    private PrintWriter writer;

    public MyVisitor( String file ){
        writer = null;
        try{
            writer = new PrintWriter(file, "UTF-8");
        } catch (Exception e) {
            // do something
        }
    }

    public void closeFile(){
        writer.close();
    }

    @Override
    public T visitHtmlDocument(PHPParser.HtmlDocumentContext ctx) {
        return super.visitHtmlDocument(ctx);
    }

    @Override
    public T visitTopStatement(PHPParser.TopStatementContext ctx) {
        return super.visitTopStatement(ctx);
    }

    @Override
    public T visitEchoStatement(PHPParser.EchoStatementContext ctx) {
        ArrayList<String> values = (ArrayList<String>) visitExpressionList(ctx.expressionList());
        for(String str : values) {
            writer.println("console.log(" + str + ");");
        }
        return null;
    }

    @Override
    public T visitExpressionList(PHPParser.ExpressionListContext ctx) {
        List<String> expressions = new ArrayList<String>();
        for(PHPParser.ExpressionContext ct : ctx.expression()){
            String resp = (String) visitExpression(ct);
            expressions.add(resp);
        }
        return (T) expressions;
    }

    @Override
    public T visitParenthesis(PHPParser.ParenthesisContext ctx) {
        if( ctx.expression() != null){
            String val = (String) visitExpression(ctx.expression());
            return (T)( "("+val+")" );
        }
        return visitYieldExpression(ctx.yieldExpression());
    }

    @Override
    public T visitExpression(PHPParser.ExpressionContext ctx) {
        List<PHPParser.ExpressionContext> exps = ctx.expression();
        if( exps.size() == 0){
            return visitAndOrExpression(ctx.andOrExpression());
        }else if(exps.size() > 1){
            return null;
        }
        String value = "";
        String valexp = (String) visitExpression(ctx.expression(0));
        String valandor = (String) visitAndOrExpression(ctx.andOrExpression());
        if( ctx.getChild(1).toString().equals("and") )
            value = valexp + " & " + valandor;
        if( ctx.getChild(1).toString().equals("or") )
            value = valexp + " | " + valandor;
        if( ctx.getChild(1).toString().equals("xor") )
            value = valexp + " ^ " + valandor;
        return (T) value;
    }

    @Override
    public T visitAndOrExpression(PHPParser.AndOrExpressionContext ctx) {
        if(ctx.andOrExpression() != null){
            String valandor = (String) visitAndOrExpression(ctx.andOrExpression());
            String valcompa = (String) visitComparisonExpression(ctx.comparisonExpression());
            if( ctx.getChild(1).toString().equals("&"))
                return (T)( valandor+" & "+valcompa );
            if( ctx.getChild(1).toString().equals("&&") )
                return (T)( valandor+" && "+valcompa );
            if( ctx.getChild(1).toString().equals("^") )
                return (T)( valandor+" ^ "+valcompa );
            if( ctx.getChild(1).toString().equals("|") )
                return (T)( valandor+" | "+valcompa );
            if(ctx.getChild(1).toString().equals("||"))
                return (T)( valandor+" || "+valcompa );
        }
        return visitComparisonExpression(ctx.comparisonExpression());
    }

    @Override
    public T visitComparisonExpression(PHPParser.ComparisonExpressionContext ctx) {
        if( ctx.comparisonExpression() != null ){
            String valcompa = (String) visitComparisonExpression(ctx.comparisonExpression());
            String valadd = (String) visitAdditionExpression(ctx.additionExpression());
            if( ctx.getChild(1).toString().equals("<>") )
                return (T)( valcompa+" != "+valadd );
            return (T)( valcompa+" "+ctx.getChild(1).toString()+" "+valadd );
        }
        return visitAdditionExpression(ctx.additionExpression());
    }

    @Override
    public T visitAdditionExpression(PHPParser.AdditionExpressionContext ctx) {
        if(ctx.additionExpression() != null){
            String valadd = (String) visitAdditionExpression(ctx.additionExpression());
            String valmul = (String) visitMultiplicationExpression(ctx.multiplicationExpression());
            if( ctx.getChild(1).toString().equals("+") || ctx.getChild(1).toString().equals(".") )
                return (T)(valadd+" + "+valmul);
            return (T)(valadd+" - "+valmul);
        }
        return visitMultiplicationExpression(ctx.multiplicationExpression());
    }

    @Override
    public T visitMultiplicationExpression(PHPParser.MultiplicationExpressionContext ctx) {

        return super.visitMultiplicationExpression(ctx);
    }

    @Override
    public T visitString(PHPParser.StringContext ctx) {
        return super.visitString(ctx);
    }
}