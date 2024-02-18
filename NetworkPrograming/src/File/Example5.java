
package File;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Example5 {
    
    public static void main(String[] args) throws IOException {
        
        //public class UsingFilterStreams 
         BufferedReader d = new BufferedReader(new InputStreamReader(System.in)); 
		String input; 
		
		while ((input = d.readLine()) != null) { 
			//do something interesting here
			System.out.println(input);
		} 
        
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
}
