
package QuastionThread;


public class Main extends Thread   {
     MyLock m ;
     
     
     
    public Main(MyLock m){
    this .m =m; 
    
     }
     @Override
    public void run(){
        
        try {
          while(true){
              synchronized(m){
               while(m.flag != 2 ){
               m.wait();
                } 
              System.out.println(Main.currentThread().getName());
              Thread.sleep(1000);
              m.flag =1 ; 
              m.notify();
           }
        
          }
        
        }catch(InterruptedException e){   
        
        
         
        
        }
        
               
     }
    
    
   
    
}
