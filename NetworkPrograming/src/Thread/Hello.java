package Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/*1- Extends For Thread Class 

 */
public class Hello implements Runnable {

    @Override
    public void run() {
        
        
         for (int i = 0; i < 5; i++) {
                System.out.println("Hello ");
            } 
        try {
                                            // Sleep Wait 500 milliSecounds
            Thread.sleep((long)(Math.random()*1000));
        } catch (Exception e) { //InterruptedException
            e.printStackTrace();
        }
        
        
    }

    
    
    
    
}
