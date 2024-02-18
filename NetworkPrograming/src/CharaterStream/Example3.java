
package CharaterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Example3 {
    
    
    public static void main(String[] args) throws IOException {
        
        
        FileWriter fw = new FileWriter("C:\\Users\\hp\\Desktop\\MyFiles\\name.txt");
       
          // هنا قمنا بكتابة نص في الملف ثم قمنا بتفريغ الذاكرة و إغلاق الكائن المتصل بالملف
        fw.write("first line.\nsecond line.\nthird line.");
        fw.flush();
        fw.close();
        
            
     try{  
        FileReader r = new FileReader("C:\\Users\\hp\\Desktop\\MyFiles\\name.txt"); 
        
         int c ; 
        while((c=r.read())!= -1){
            System.out.print((char)c);
         }
        r.close();
        
     }catch(IOException e ){
    
     }
        
    }
}
