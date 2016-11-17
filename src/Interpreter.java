import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Interpreter {

    public static void main(String [] args) throws Exception{
        InputStream originalInput = System.in;
        System.setIn(new FileInputStream(new File("input.txt")));
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        PHPLexer lexer = new PHPLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PHPParser parser = new PHPParser(tokens);
        ParseTree tree = parser.htmlDocument();
        System.setIn(originalInput);
        MyVisitor<Object> loader = new MyVisitor<Object>();
        loader.visit(tree);
    }
}