
package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Example1 {
   
    public static void main(String[] args) {
        
        try {
        File f =new File("C:\\Users\\hp\\Desktop\\MyFiles\\khalid.txt"); 
        if(f.createNewFile()){
            System.out.println("File Created : "+ f.getName());
         }else {
            System.out.println("File is Already exists");   
        }
            FileWriter w = new FileWriter(f); 
            w.write("khalid ahmad younes");
            w.close();
            
        
        }catch(IOException e){
        System.out.println("An error occurred.");
        e.printStackTrace();
        
        }
    }
    
    
    
    
    
    
    
    
    
}
