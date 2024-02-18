package networkprograming;

public class SimpleThread extends Thread {

    public SimpleThread(String str) {
        super(str);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            try { // at this point, current thread is ‘this’.
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
        System.out.println("DONE! " + getName());
    }
    
    
    
    
    
    
    
    
    
    
    
    

    public static void main(String[] args) { 
        
//         new SimpleThread("khalid").start();
//         new SimpleThread("Ameen").start();
        
         
               new SimpleThread("Thread1").start();
               new SimpleThread("Thread2").start(); 
                
                
                
                
    }

}
