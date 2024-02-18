
package Thread;


public class ThreadShowname extends Thread{
    
    
    @Override
    public void run(){
    
      int pause =0 ; 
       
        for (int i = 0; i < 5; i++) {
            
            try{
                System.out.println( getName() +" being  executed");
                pause =(int)(Math.random() +3000);  
                Thread.sleep(pause); // 0-3 secounds
                
            }catch(Exception e ){
                System.out.println(e);
            } 
            
            
        }
      
    } 
    
    public static void main(String[] args) {
        
       

        
         ThreadShowname thread1, thread2 ,thread3,thread4;
         thread1 = new ThreadShowname();
         thread2 = new ThreadShowname();
         thread3 = new ThreadShowname();
         thread4 = new ThreadShowname();
         thread1.start(); //Will call run .
         thread2.start(); //Will call run .
         thread3.start(); //Will call run .
         thread4.start(); //Will call run .
         
    }
    
    
    
    
    
    
    
    
    
}
