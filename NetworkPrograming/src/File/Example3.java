
package File;

import java.io.File;

public class Example3 {
   
    
    public static void main(String[] args) {
        
        File myObj = new File("C:\\ptuk\\filename.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
        
        
        
        
    }
    
    
    
    
    
    
    
    
}
