
package CharaterStream;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Example1 {
    
    
    public static void main(String[] args) throws IOException {
            
        
        FileReader in = null ; 
        FileWriter out =null ; 
        
        try {
            
            in = new FileReader("C:\\Users\\hp\\Desktop\\MyFiles\\input.txt"); 
            out= new FileWriter("C:\\Users\\hp\\Desktop\\MyFiles\\output.txt");  
            
            int c ; 
            while ((c =in.read()) != -1){
                System.out.print((char)c);
            } 
        }catch(IOException e ){
            System.out.println("ther is IOException");
           
        
         } 
        finally {
        if(in != null ){
            in.close();
        
        }
        if(out != null){
        out.close();
        }
        }
        
        
         
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
