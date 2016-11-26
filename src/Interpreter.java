import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Interpreter {
    public ArrayList<ArrayList<String>> toVisit;

    public Interpreter(){
        toVisit = new ArrayList<ArrayList<String>>();
    }
    public void filers( String from, String to ){
        File file = new File(from);

        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
            if( files[i].isDirectory()){
                File newFolder = new File(to+"\\"+files[i].getName());
                boolean result = false;
                if( !newFolder.exists() ) {
                    try {
                        newFolder.mkdir();
                        result =true;
                    } catch (Exception e) {
                        System.err.println("Error creando una carpeta nueva, revise sus permisos");
                        System.exit(-1);
                    }
                    if( !result ){
                        System.err.println("Error creando una carpeta nueva, revise sus permisos");
                        System.exit(-1);
                    }
                }
                filers( from+"\\"+files[i].getName(), to+"\\"+files[i].getName() );
            }else if( files[i].isFile() && files[i].getName().contains(".php") ){
                ArrayList<String> vals = new ArrayList<String>();
                vals.add(from+"\\"+files[i].getName());
                vals.add(to+"\\"+files[i].getName().replace(".php", ".js"));
                toVisit.add( vals );
            }else{
                File actual = new File(from+"\\"+files[i].getName());
                File copy = new File(to+"\\"+files[i].getName());
                InputStream input = null;
                OutputStream output = null;
                try {
                    input = new FileInputStream(actual);
                    output = new FileOutputStream(copy);
                    byte[] buf = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = input.read(buf))>0){
                        output.write( buf, 0, bytesRead );
                    }
                }catch ( Exception e ){
                    System.err.println("Error copiando un archivo, revise sus permisos");
                    System.exit(-1);
                } finally {
                    try {
                        input.close();
                        output.close();
                    }catch (Exception e){
                        System.err.println("Error copiando un archivo, revise sus permisos");
                        System.exit(-1);
                    }
                }
            }
        }
    }

    public static void main(String [] args) throws Exception{
        Interpreter inter = new Interpreter();
        inter.filers(args[0], args[1]);
        System.out.println(inter.toVisit);

        for( ArrayList file: inter.toVisit ){
            InputStream originalInput = System.in;
            System.setIn(new FileInputStream(new File( (String) file.get(0) )));
            ANTLRInputStream input = new ANTLRInputStream(System.in);
            PHPLexer lexer = new PHPLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PHPParser parser = new PHPParser(tokens);
            ParseTree tree = parser.htmlDocument();
            System.setIn(originalInput);
            MyVisitor<Object> loader = new MyVisitor<Object>((String) file.get(1));
            loader.visit(tree);
            loader.closeFile();
        }
        /*InputStream originalInput = System.in;
        System.setIn(new FileInputStream(new File("input.txt")));
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        PHPLexer lexer = new PHPLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PHPParser parser = new PHPParser(tokens);
        ParseTree tree = parser.htmlDocument();
        System.setIn(originalInput);
        MyVisitor<Object> loader = new MyVisitor<Object>("prueba.txt");
        loader.visit(tree);
        loader.closeFile();*/
    }
}