/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */

import java.net.*;
import java.io.*;
import java.util.Date;
import java.util.Scanner;
//import org.json.JSONArray;

public class couchutils {
    public static void main(String[] args) throws MalformedURLException, IOException {
        System.out.println("cuexport started...");
        
        /*URL url = new URL("http://www.google.com/");   
        URLConnection yc = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();*/
        
        URL url = new URL( "http://localhost:5984/blog/06cf5eb1c44ba40f0c364401940009e9" ); 
        URLConnection con = url.openConnection(); 
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
        out.write(in.readLine());
        in.close();
        out.close();
        
        //JSONArray jarr = new JSONArray(in.readLine());
    }
}
