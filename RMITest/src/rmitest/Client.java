
package rmitest;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class Client {

 
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
 
        // stup For Clinet ..
         
        HalloServese servese = (HalloServese) Naming.lookup("rmi://localhost:5099/hallo");
        System.out.println("--- "+servese.echo("hey Server") + " "+ 
                                            servese.getClass().getName());

    }
    
}
