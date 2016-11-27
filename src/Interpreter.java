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
                vals.add(to+"\\"+files[i].getName().replace(".php", ".js").replace(" ","_"));
                vals.add(files[i].getName().replace(".php", "").replace(" ","_"));
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
        inter.filers(args[0], args[1]+"");

        File server = new File(args[1]+"\\NodeServer.js");
        File router = new File(args[1]+"\\NodeRouter.js");
        File request = new File(args[1]+"\\NodeRequestHandler.js");
        File inx = new File(args[1]+"\\NodeIndex.js");

        PrintWriter writer = new PrintWriter(server, "UTF-8");
        writer.println("var http = require(\"http\");");
        writer.println("var url = require(\"url\");");
        writer.println("function iniciar(route, handle) {");
        writer.println("\tfunction onRequest(request, response) {");
        writer.println("\t\tvar pathname = url.parse(request.url).pathname;");
        writer.println("\t\tconsole.log(\"Peticion para \" + pathname + \" recibida.\");");
        writer.println("\t\trequest.setEncoding(\"utf8\");");
        writer.println("\t\troute(handle, pathname, response );");
        writer.println("\t}");
        writer.println("\thttp.createServer(onRequest).listen(8888);");
        writer.println("\tconsole.log(\"Servidor Iniciado\");");
        writer.println("}");
        writer.println("exports.iniciar = iniciar;");
        writer.close();

        writer = new PrintWriter( router, "UTF-8" );
        writer.println("function route(handle, pathname, response) {");
        writer.println("\tconsole.log(\"A punto de rutear una peticion para \" + pathname);");
        writer.println("\tif (typeof handle[pathname] === 'function') {");
        writer.println("\t\thandle[pathname](response);");
        writer.println("\t} else {");
        writer.println("\t\tconsole.log(\"No hay manipulador de peticion para \" + pathname);");
        writer.println("\t\tresponse.writeHead(404, {\"Content-Type\": \"text/html\"});");
        writer.println("\t\tresponse.write(\"404 No Encontrado\");");
        writer.println("\t\tresponse.end();");
        writer.println("\t}");
        writer.println("}");
        writer.println("exports.route = route;");
        writer.close();

        PrintWriter requestHandler = new PrintWriter(request, "UTF-8");
        PrintWriter index = new PrintWriter(inx, "UTF-8");

        index.println("var server = require(\"./NodeServer\");");
        index.println("var router = require(\"./NodeRouter\");");
        index.println("var requestHandlers = require(\"./NodeRequestHandler\");");
        index.println("\nvar handle = {}");

        for( ArrayList file: inter.toVisit ){
            InputStream originalInput = System.in;
            System.setIn(new FileInputStream(new File( (String) file.get(0) )));
            ANTLRInputStream input = new ANTLRInputStream(System.in);
            PHPLexer lexer = new PHPLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PHPParser parser = new PHPParser(tokens);
            ParseTree tree = parser.htmlDocument();
            System.setIn(originalInput);
            MyVisitor<Object> loader = new MyVisitor<Object>((String) file.get(1), (String) file.get(2) );
            loader.visit(tree);
            loader.closeFile();
            requestHandler.println("function "+ file.get(2)+"(response){");
            System.out.println(((String) file.get(1)).replace(args[1],"").replace(".js","").replace("\\","/"));
            requestHandler.println("\tvar resp = require(\"."+ ((String) file.get(1)).replace(args[1],"").replace(".js","").replace("\\","/") +"\");");
            requestHandler.println("\tresp."+file.get(2)+"( response );");
            requestHandler.println("}");
            requestHandler.println("");
            requestHandler.println("exports."+file.get(2)+" = "+file.get(2)+";\n");

            index.println("handle[\"/"+((String) file.get(0)).replace((args[0])+"\\", "").replace(".php", "").replace("\\","/")+"\"] = requestHandlers."+file.get(2)+";");
        }
        index.println("server.iniciar(router.route, handle);");
        index.close();
        requestHandler.close();
    }
}