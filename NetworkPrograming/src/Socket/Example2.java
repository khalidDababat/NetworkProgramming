
package Socket;

import java.io.IOException;
import java.net.Socket;


public class Example2 {
    
    public static void main(String[] args) throws IOException {
        
        
        Socket s =new Socket("www.facebook.com",80);
        System.out.println(s.getChannel());
        System.out.println(s.getPort());
        System.out.println(s.isConnected());
        System.out.println(s.getKeepAlive());
        System.out.println(s.getLocalPort());
        System.out.println(s.getSendBufferSize());
    }
    
    
    
    
    
    
    
}
