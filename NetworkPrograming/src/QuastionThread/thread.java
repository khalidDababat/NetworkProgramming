
package QuastionThread;


public class thread extends Thread  {
        
    
    MyLock m ; 
    
    public thread(MyLock m){
     this.m =m ; 
    
     }
    
    @Override
    public void run(){
        
        try{
        
            while(true ){
               synchronized(m) {
                  while(m.flag != 1 ){         
                     m.wait(); 
                   }
                    System.out.println(thread.currentThread().getName());
                    Thread.sleep(1000);
                    m.flag =2 ; 
                    m.notify();
             
      
             }       
            }
        
         }catch(InterruptedException e ){
         
          }
        
        }
    
    
    
    
    
    
}
