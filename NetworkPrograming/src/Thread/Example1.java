package Thread;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.ThreadGroup;
public class Example1 {

    public static void main(String[] args) {

        // Using Thread Tow Object mack at The Parralel   
        // impliments For Runnaple Directly    
        // Using Anoinmays and PloyMorphism   
        // Convert To Lamda Experstion 
        
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello ");
            }
            try {
                // Sleep Wait 500 milliSecounds
                Thread.sleep(500);
            } catch (Exception e) { //InterruptedException
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("world  ");
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(World.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

        t1.start();
        t2.start();

       
    }
}
