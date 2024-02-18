
package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Example2 {
   // Read File 
    public static void main(String[] args) {
        
        
        Scanner myReader=null;
	  
	  try {
    	
      File myObj = new File("C:\\Users\\hp\\Desktop\\MyFiles\\name.txt");
      myReader = new Scanner(myObj);  
      
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      
      
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }finally {
            myReader.close();
        }
  
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
