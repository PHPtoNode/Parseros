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
    public T visitExpression(PHPParser.ExpressionContext ctx) {
        return (T) ctx.getText();
    }

    @Override
    public T visitString(PHPParser.StringContext ctx) {
        return super.visitString(ctx);
    }

    @Override
    public T visitMultiplicationExpression(PHPParser.MultiplicationExpressionContext ctx) {
        return super.visitMultiplicationExpression(ctx);
    }

    @Override
    public T visitAssignmentStatement(PHPParser.AssignmentStatementContext ctx) {
        if(ctx.assignmentOperator() != null ){
            String var = (String) visitChain( ctx.chain(0) );
            writer.println(("var "+var+ctx.assignmentOperator().getText()+ctx.expression().getText()+";"));
        }
        return super.visitAssignmentStatement(ctx);
    }

    @Override
    public T visitChain(PHPParser.ChainContext ctx) {
        return (T) ctx.getText().replace("$", "");
        //return super.visitChain(ctx);
    }
}