package RMIExample;


import java.rmi.Naming;

public class MyClient {
                   //  Create and run the client application
    public static void main(String[] args) {

        try {
            Adder stup = (Adder) Naming.lookup("rmi://localhost:5000/sonoo");
            System.out.println(stup.add(34, 4));
        } catch (Exception e) {

        }

    }

}
