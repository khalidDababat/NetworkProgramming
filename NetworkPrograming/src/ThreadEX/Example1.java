package ThreadEX;

import URL.Examole1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example1 extends Thread {

    
    
    
    public void run() {
        int pause;

        for (int i = 0; i < 5; i++) {

            try {
                System.out.println(
                        getName() + " being executed.");
                pause = (int) (Math.random() * 3000);
                Thread.sleep(pause); //0-3 seconds.

            } catch (InterruptedException e) {

            }

        }

    }

    
    
    
    
    
    
    // try with resource 
    static String readFirstLineFromFile(String path) throws IOException {
	    try (FileReader fr = new FileReader(path);
	         BufferedReader br = new BufferedReader(fr)) {
	        return br.readLine();
	    }
	}	
    
    static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
   
    FileReader fr = new FileReader(path);
    BufferedReader br = new BufferedReader(fr);
    try {
        return br.readLine();
    }
    finally {
        br.close();
        fr.close();
    }
}
    
    public static void main(String[] args) {

        new Example1().start();
        
        Example1 e1 = new Example1(); 
        Example1 e2 = new Example1(); 
        e1.start();
        e2.start(); 
      
        

    }

}
