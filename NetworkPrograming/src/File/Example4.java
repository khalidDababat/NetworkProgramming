package File;

import java.io.File;

public class Example4 {

    public static void main(String[] args) {

        File myObj = new File("C:\\Users\\hp\\Desktop\\MyFiles\\name.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }

    }

}
