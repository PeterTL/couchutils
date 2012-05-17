
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
public class unused {
    public static void main(String[] args) throws MalformedURLException, IOException {
        System.out.println("cuexport for the win!");
        
        /*URL url = new URL("http://www.google.com/");   
        URLConnection yc = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();*/
        
        URL url = new URL( "http://localhost:5984/blog/06cf5eb1c44ba40f0c364401940009e9" ); 
        URLConnection con = url.openConnection(); 
        /*System.out.println( con ); 
        System.out.println( "Date            : " + new Date(con.getDate()) ); 
        System.out.println( "Last Modified   : " + new Date(con.getLastModified()) ); 
        System.out.println( "Content encoding: " + con.getContentEncoding() ); 
        System.out.println( "Content type    : " + con.getContentType() ); 
        System.out.println( "Content length  : " + con.getContentLength() );*/
        
        /*BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();*/
        
        //System.out.println( new Scanner( url.openStream() ).useDelimiter( "\\Z" ).next() );
        
        Object o = url.getContent();
        System.out.println("I got a " + o.getClass().getName());
    }
}
