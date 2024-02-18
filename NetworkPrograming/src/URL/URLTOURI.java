
package URL;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


public class URLTOURI {
   
    
    public static void main(String[] args) {
        
        
        // URL ..> URI 
        URL url =null ; 
        URI uri =null ; 
        
        try { 
        uri =new URI("http://www.google.com/ncr"); 
        url =uri.toURL(); 
        uri =new URI(url.toString());
        
        
        }catch(MalformedURLException e ){
        
        e.printStackTrace();
         }catch(URISyntaxException e ){
         e.printStackTrace();
          }
    }
    
    
    
    
}
