
package URL;

import java.net.MalformedURLException;
import java.net.URL;


public class ProtocolTester {
    
    public static void main(String[] args) throws MalformedURLException {
             
        /*
        www.opensuse,org 
        www.ptuk.edu
        http://www.mocrosoft.com/ar-ig
        
        */
        
        String Host = "www.ptuk.edu";
        String file = "index.html";
        String [] regex ={ 
            "Https","Http","ftp","MailTo","telnet","file","ldap","Jdbc"
        };
        
        for (int i = 0; i < regex.length; i++) {
           
            try { 
            URL u =new URL(regex[i] ,Host,file);
            System.out.println(regex[i] + " is supported ");
            
            
            }catch(Exception e ) {
                System.out.println(regex[i] + " is not supported ");
            } 
            }
        
    }
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    

