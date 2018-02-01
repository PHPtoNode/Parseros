package phptonode.RESTService;


import phptonode.Interpreter;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by diego on 11/27/16.
 */

@Path("Service")
public class PathService {
    public Interpreter a;


    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    @Path("getProgress")
    public Integer getClichedMessage() {
        return a.progress;

    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getClichedMessage(List<String> paths) throws Exception {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        ByteArrayOutputStream errorString = new ByteArrayOutputStream();
        PrintStream es = new PrintStream(errorString);
        PrintStream olderror = System.err;
        System.setErr(es);

        a = new Interpreter();
        String[] args = {paths.get(0), paths.get(1)};
        a.progress = 5;
        a.generateConversion(args);
        for( String i: paths)
            System.out.printf(i);

        System.out.flush();
        System.setOut(old);
        System.err.flush();
        System.setErr(olderror);
        System.out.println("test");
        ArrayList<String> a = new ArrayList<>();
        for(String i : (baos.toString() +"\n" + errorString.toString()).split("\n")){
            a.add(i);
        }

        return a;
    }

}
