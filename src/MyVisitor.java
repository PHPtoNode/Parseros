import java.util.*;
import java.io.PrintWriter;

public class MyVisitor<T> extends PHPParserBaseVisitor<T> {

    private PrintWriter writer;
    private String tabulations;

    public MyVisitor( String file ){
        writer = null;
        try{
            writer = new PrintWriter(file, "UTF-8");
        } catch (Exception e) {
            // do something
        }
        tabulations = "";
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
        String val = (String) super.visitTopStatement(ctx);
        writer.println(val+"");
        return null;
    }

    @Override
    public T visitInnerStatementList(PHPParser.InnerStatementListContext ctx) {
        String total = "";
        for (PHPParser.InnerStatementContext ct: ctx.innerStatement()){
            String val = (String) visitInnerStatement(ct);
            total += tabulations+val+"\n";
        }
        return (T)( total );
    }

    @Override
    public T visitInnerStatement(PHPParser.InnerStatementContext ctx) {
        return super.visitInnerStatement(ctx);
    }

    @Override
    public T visitStatement(PHPParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public T visitNonEmptyStatement(PHPParser.NonEmptyStatementContext ctx) {
        return super.visitNonEmptyStatement(ctx);
    }

    @Override
    public T visitBlockStatement(PHPParser.BlockStatementContext ctx) {
        tabulations += "\t";
        String inner = (String) visitInnerStatementList(ctx.innerStatementList());
        tabulations = tabulations.substring(0, tabulations.length()-1);
        return (T)("{\n"+inner+tabulations+"}");
    }

    @Override
    public T visitIfStatement(PHPParser.IfStatementContext ctx) {
        String total = "", elseIfStr = "", elseStr="";
        String paren = (String) visitParenthesis(ctx.parenthesis());
        if( ctx.statement() != null ) {
            String state = (String) visitStatement(ctx.statement());
            total = "if" + paren + state;
            if (ctx.elseIfStatement() != null) {
                List<PHPParser.ElseIfStatementContext> elses = ctx.elseIfStatement();
                for (PHPParser.ElseIfStatementContext ct : elses) {
                    String elseval = (String) visitElseIfStatement(ct);
                    elseIfStr += elseval;
                }
            }
            if (ctx.elseStatement() != null) {
                elseStr = (String) visitElseStatement(ctx.elseStatement());
            }
            total += elseIfStr + elseStr;
        }else{
            tabulations += "\t";
            String inner = (String)visitInnerStatementList(ctx.innerStatementList());
            tabulations = tabulations.substring(0, tabulations.length()-1);
            total = "if" + paren + "{\n"+inner+"}";
            if(ctx.elseIfColonStatement() != null){
                List<PHPParser.ElseIfColonStatementContext> elses = ctx.elseIfColonStatement();
                for(PHPParser.ElseIfColonStatementContext ct: elses){
                    tabulations += "\t";
                    String elseval = (String) visitElseIfColonStatement(ct);
                    tabulations = tabulations.substring(0, tabulations.length()-1);
                    elseIfStr += elseval;
                }
            }
            if( ctx.elseColonStatement() != null ){
                elseStr += (String) visitElseColonStatement(ctx.elseColonStatement());
            }
            total += elseIfStr + elseStr;
        }
        return (T)total;
    }

    @Override
    public T visitWhileStatement(PHPParser.WhileStatementContext ctx) {
        String total = "while", inner = "";
        String par = (String) visitParenthesis(ctx.parenthesis());
        total += par;
        if(ctx.statement() != null){
            inner = (String) visitStatement(ctx.statement());
        }else{
            tabulations += "\t";
            inner = ((String) visitInnerStatementList(ctx.innerStatementList()));
            tabulations = tabulations.substring(0, tabulations.length()-1);
            inner = "{\n"+inner+tabulations+"}";
        }
        total += inner;
        return (T)total;
    }

    @Override
    public T visitDoWhileStatement(PHPParser.DoWhileStatementContext ctx) {
        String total = "do";
        String par = (String) visitParenthesis(ctx.parenthesis());
        String state = (String) visitStatement(ctx.statement());
        total += state+"while"+par+";";
        return (T)total;
    }

    @Override
    public T visitForStatement(PHPParser.ForStatementContext ctx) {
        String total = "for(";

        if( ctx.forInit() != null ) {
            ArrayList<String> forInit = (ArrayList<String>) visitForInit(ctx.forInit());
            total += "var";
            for (String init : forInit) {
                total += init.replace("var", "") + ", ";
            }
            total = total.substring(0, total.length() - 2);
        }
        total += "; ";
        if( ctx.expressionList() != null ) {
            ArrayList<String> expList = (ArrayList<String>) visitExpressionList(ctx.expressionList());
            for (String exp : expList) {
                total += exp + ", ";
            }
            total = total.substring(0, total.length() - 2) ;
        }
        total += "; ";
        if( ctx.forUpdate() != null ) {
            ArrayList<String> forUpd = (ArrayList<String>) visitForUpdate(ctx.forUpdate());
            for (String upd : forUpd) {
                total += upd + ", ";
            }
            total = total.substring(0, total.length() - 2);
        }

        total += ")";
        String state = (String) visitStatement(ctx.statement());
        total += state;
        return (T)total;
    }

    @Override
    public T visitElseIfStatement(PHPParser.ElseIfStatementContext ctx) {
        String total = "", elseStr = "";
        String paren = (String) visitParenthesis(ctx.parenthesis());
        String state = (String) visitStatement(ctx.statement());
        total = "else if"+paren+state;
        return (T) total;
    }

    @Override
    public T visitElseIfColonStatement(PHPParser.ElseIfColonStatementContext ctx) {
        String total = "", elseStr = "";
        String paren = (String) visitParenthesis(ctx.parenthesis());
        String inner = (String) visitInnerStatementList( ctx.innerStatementList() );
        total = "else if"+paren+"{\n"+tabulations+inner+"}";
        return (T) total;
    }

    @Override
    public T visitElseStatement(PHPParser.ElseStatementContext ctx) {
        String total = "";
        String state = (String) visitStatement(ctx.statement());
        total = "else"+state;
        return (T) total;
    }

    @Override
    public T visitElseColonStatement(PHPParser.ElseColonStatementContext ctx) {
        String total = "";
        String inner = (String) visitInnerStatementList(ctx.innerStatementList());
        total = "else"+inner;
        return (T) total;
    }

    @Override
    public T visitSwitchStatement(PHPParser.SwitchStatementContext ctx) {
        String total = "switch";
        total += (String) visitParenthesis(ctx.parenthesis());
        total += "{\n";
        tabulations += "\t";
        for (PHPParser.SwitchBlockContext ct: ctx.switchBlock()) {
            total += tabulations + (String) visitSwitchBlock(ct);
        }
        tabulations = tabulations.substring(0, tabulations.length()-1);
        total += "}";
        return (T)(total);
    }

    @Override
    public T visitSwitchBlock(PHPParser.SwitchBlockContext ctx) {
        String total = "";
        if( ctx.expression().size() > 0 ){
            total += "case ";
            for (PHPParser.ExpressionContext ct : ctx.expression()) {
                total += (String) visitExpression(ct);
                total += ":\n";
            }
        }else{
            total += "default ";
            total += ":\n";
        }
        tabulations += "\t";
        total += (String) visitInnerStatementList(ctx.innerStatementList());
        tabulations = tabulations.substring(0, tabulations.length()-1);
        return (T)(total);
    }

    @Override
    public T visitBreakStatement(PHPParser.BreakStatementContext ctx) {
        String total = "break";
        if( ctx.expression() != null )
            total += " " + (String) visitExpression(ctx.expression());
        return (T) (total+";");
    }

    @Override
    public T visitContinueStatement(PHPParser.ContinueStatementContext ctx) {
        String total = "continue";
        if( ctx.expression() != null )
            total += " " + (String) visitExpression(ctx.expression());
        return (T) (total+";");
    }

    @Override
    public T visitReturnStatement(PHPParser.ReturnStatementContext ctx) {
        String total = "return";
        if( ctx.expression() != null )
            total += " " + (String) visitExpression(ctx.expression());
        return (T) (total+";");
    }

    @Override
    public T visitGlobalStatement(PHPParser.GlobalStatementContext ctx) {
        String total = "";
        for(PHPParser.GlobalVarContext ct : ctx.globalVar() ) {
            String var = (String) visitGlobalVar(ct);
            total += var+" = null, ";
        }
        total = total.substring(0,total.length()-2 )+";";
        return (T)(total);
    }

    @Override
    public T visitGlobalVar(PHPParser.GlobalVarContext ctx) {
        if( ctx.getChild(0).getClass().toString().equals("class org.antlr.v4.runtime.tree.TerminalNodeImpl") ) {
            return (T)(ctx.getText().replace("$",""));
        }
        return null;
    }

    @Override
    public T visitEchoStatement(PHPParser.EchoStatementContext ctx) {
        ArrayList<String> values = (ArrayList<String>) visitExpressionList(ctx.expressionList());
        String total = "";
        for(String str : values) {
            total += "response.write(" + str + ");";
            if( values.size() > 1 ) total += "\n";
        }
        return (T)total;
    }

    @Override
    public T visitExpressionStatement(PHPParser.ExpressionStatementContext ctx) {
        String val = (String) visitExpression(ctx.expression());
        return (T)(val+";");
    }

    @Override
    public T visitUnsetStatement(PHPParser.UnsetStatementContext ctx) {
        String total = "";
        ArrayList<String> chns = (ArrayList<String>) visitChainList(ctx.chainList());
        for( String chn: chns ){
            if( chn.contains("[") ){
                total += "delete "+chn+";\n";
            }else{
                total += chn+" = undefined;\n";
            }
        }
        return (T)( total );
    }

    @Override
    public T visitChainList(PHPParser.ChainListContext ctx) {
        ArrayList<String> chns = new ArrayList<String>();
        for(PHPParser.ChainContext ct: ctx.chain()) {
            chns.add((String) visitChain(ct));
        }
        return (T)( chns );
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
            return (T)( "( "+val+" )" );
        }
        return visitYieldExpression(ctx.yieldExpression());
    }

    @Override
    public T visitArrayCreationExpression(PHPParser.ArrayCreationExpressionContext ctx) {
        System.out.println(ctx.getChild(0).getText());
        if(ctx.getChild(0).getText().equals("[")){
            visitArrayItemList(ctx.arrayItemList());
        }
        return null;
    }

    @Override
    public T visitArrayItemList(PHPParser.ArrayItemListContext ctx) {

        for(PHPParser.ArrayItemContext ct: ctx.arrayItem()){
            String item = (String)visitArrayItem(ct);
        }
        return super.visitArrayItemList(ctx);
    }

    @Override
    public T visitConstantInititalizer(PHPParser.ConstantInititalizerContext ctx) {
        System.out.println(ctx.getChild(0));
        return null;
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
        if( ctx.multiplicationExpression() != null ){
            if( ctx.typeRef() != null ){
                return null;
            }else{
                String valmul = (String) visitMultiplicationExpression(ctx.multiplicationExpression());
                String valnot = (String) visit( ctx.notLeftRecursionExpression() );
                if( ctx.getChild(1).getText().equals("**") )
                    return (T) (" Math.pow("+valnot+","+valmul+") ");
                else if( ctx.getChild(1).getText().equals("*") || ctx.getChild(1).getText().equals("/") || ctx.getChild(1).getText().equals("%") )
                    return (T) (valmul+" "+ctx.getChild(1).getText()+" "+valnot);
            }
        }
        return super.visitMultiplicationExpression(ctx);
    }

    @Override
    public T visitAssignmentExpression(PHPParser.AssignmentExpressionContext ctx) {
        List<PHPParser.ChainContext> chains = (List<PHPParser.ChainContext>) ctx.chain();
        if( chains.size() != 1 ){

        }else{
            String chn = (String) visitChain(chains.get(0));
            String exp = (String) visitExpression(ctx.expression());
            return (T)( "var "+chn+" "+ctx.assignmentOperator().getText()+" "+exp);
        }
        return super.visitAssignmentExpression(ctx);
    }

    @Override
    public T visitChain(PHPParser.ChainContext ctx) { return (T)( ctx.getText().replace("$","") ); }

    @Override
    public T visitIndexerExpression(PHPParser.IndexerExpressionContext ctx) {
        String name = (String) visitStringConstant(ctx.stringConstant());
        String exp = (String) visitExpression(ctx.expression());
        return (T)( name+"["+exp+"]" );
    }

    @Override
    public T visitPrefixIncDecExpression(PHPParser.PrefixIncDecExpressionContext ctx) {
        String chn = (String) visitChain(ctx.chain());
        return (T)( ctx.getChild(0)+chn );
    }

    @Override
    public T visitPostfixIncDecExpression(PHPParser.PostfixIncDecExpressionContext ctx) {
        String chn = (String) visitChain(ctx.chain());
        return (T)( chn+ctx.getChild(1) );
    }

    @Override
    public T visitPrintExpression(PHPParser.PrintExpressionContext ctx) {
        String value = (String) visitExpression(ctx.expression());
        return (T)("console.log(" + value + ")");
    }

    @Override
    public T visitConstant(PHPParser.ConstantContext ctx) { return (T) ctx.getText(); }

    @Override
    public T visitString(PHPParser.StringContext ctx) { return (T) ctx.getText(); }
}