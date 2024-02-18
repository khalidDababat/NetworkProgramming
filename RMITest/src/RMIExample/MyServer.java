package RMIExample;

import java.rmi.Naming;

public class MyServer {
 //                     Create and run the server application 
    public static void main(String[] args) {

        try {
            Adder stub = (Adder) new AdderRemote();
            Naming.rebind("rmi:// 192.168.1.5:5000/sonoo", stub);
        } catch (Exception e) {
            System.out.println(e);
        }
    }



}
