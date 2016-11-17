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
        System.out.println(ctx.expressionList().getText());
        writer.println("The first line");
        return super.visitEchoStatement(ctx);
    }
}