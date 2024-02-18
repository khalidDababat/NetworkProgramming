
package URL;
import java.net.MalformedURLException;
import java.net.URI; 
import java.net.URISyntaxException;


public class Examole1 {
   
    
    public static void main(String[] args) throws  URISyntaxException  {
        
       //URI u = new URI("https://lms.ptuk.edu.ps/course/view.php?id=24295#80"); 
        URI u = new URI("ftp://mp3:mp3@ci43198-a.ashvil1.nc.home.com:33/VanHalen-Jump.mp3"); 
        
        System.out.println("Scheme "+ u.getScheme());
        System.out.println("Authority "+ u.getAuthority());
        System.out.println("Path "+ u.getPath());
        System.out.println("Query "+ u.getQuery());        
        System.out.println("Fragment "+u.getFragment());
        System.out.println("Host "+ u.getHost());
        System.out.println("Port: "+ u.getPort());
        System.out.println("" + u.getRawAuthority());
        System.out.println(u.getUserInfo()); 
        System.out.println(u.isAbsolute());
        System.out.println(u.isOpaque());
        
        
    }
    
    
    
    
    
    
}
