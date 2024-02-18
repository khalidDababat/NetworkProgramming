package URL;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLInfo {

    public static void Info(URL url) throws IOException {

        URLConnection c = url.openConnection();

        c.connect();

        System.out.println("ConnectType " + c.getContentType());
        System.out.println("Connect Encoding " + c.getContentEncoding());
        System.out.println("connecct Length " + c.getContentLength());
        System.out.println("Date " + new Date(c.getDate()));
        System.out.println("last Modifie " + new Date(c.getLastModified()));
        System.out.println("Expiration " + c.getExpiration());
        System.out.println("ConnectTimeout " + c.getConnectTimeout()); 
        
 
        if(c instanceof HttpURLConnection ){ // الاشياء الممكن انحسنها في http 
            HttpURLConnection h = (HttpURLConnection)c; 
            System.out.println("Request Method " + h.getRequestMethod());
            System.out.println("Responce Message " + h.getResponseMessage());
            System.out.println("Responce code " + h.getResponseCode());
         

            
         }
        
        
    }
    
    
    public static void main(String[] args) throws MalformedURLException, IOException {
            Info(new URL("https://lms.ptuk.edu.ps/login/index.php"));
        
        
    }
    
    

}
