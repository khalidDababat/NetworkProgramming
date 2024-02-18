
package networkprograming;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class File1 {
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
                File inputFile = new File("C:\\Users\\hp\\Desktop\\20232\\program Network\\Ptuk\\In.txt");
		File outputFile = new File("C:\\Users\\hp\\Desktop\\20232\\program Network\\Ptuk\\Out.txt");
		
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		
		int c;
		while ((c = in.read()) != -1) {
			System.out.println(c);
			out.write(c);
		}
		in.close();
		out.close(); 
        
        
        
        
    }
    
    
    
}
