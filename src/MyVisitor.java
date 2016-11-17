import java.util.*;

public class MyVisitor<T> extends PHPParserBaseVisitor<T> {

    @Override
    public T visitHtmlDocument(PHPParser.HtmlDocumentContext ctx) {
        return super.visitHtmlDocument(ctx);
    }
}