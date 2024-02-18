
package Socket;

import com.sun.corba.se.spi.activation.Server;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Example3 {
    
    
    public static void main(String[] args) throws IOException {
        
        ServerSocket ss =new ServerSocket(4999); 
        Socket s =ss.accept() ; 
        
        System.out.println("Clint connected");

        
              
        
    }
}
