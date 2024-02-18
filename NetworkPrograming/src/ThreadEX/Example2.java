
package ThreadEX;


public class Example2 extends Thread {
    
    @Override
    public void run(){
        
        int pause ; 
        for (int i = 0; i < 5; i++) {
             
            System.out.println("Hallo ");
            
            try{
                pause =(int)(Math.random() *3000); 
              Thread.sleep(pause);
               
            }catch(InterruptedException e ){
            }
            
        }
  
        
    } 
    
    
    
    public static void main(String[] args) {
        
        Example2 e = new Example2(); 
        e.start();  
        
        
    }
    
    
    
    
    
    
    
    
}
