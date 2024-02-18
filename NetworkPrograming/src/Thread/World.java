
package Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/*1- Extends For Thread Class 
  2- Sleep(Miili Secounds,,, ) 
  3- Implements For Runnable Directliy 
 // Using Thread Tow Object mack at The Parralel     
 // Using Anoinmays and PloyMorphism   
 // Lamda Exprection  



*/
public class World implements Runnable {
    
    
    
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("world  ");
        }
        try {
            Thread.sleep((long)(Math.random()*1000));
        } catch (InterruptedException ex) {
            Logger.getLogger(World.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
    
    
    
    
}
