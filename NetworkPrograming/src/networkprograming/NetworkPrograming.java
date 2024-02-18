package networkprograming;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
//import java.net.Socket;
////import java.net.URL;
//import java.net.URLConnection;
//import java.util.Calendar; 

import java.util.Scanner;

public class NetworkPrograming {

    public static void main(String[] args) throws IOException {

        //
         // int CurrentYear = Calendar.getInstance().get(Calendar.YEAR);  //..> Get Curret Year 
       
         
       
       

    }
       
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    // try with resources 
    static String readFirstLineFromFile(String path) throws IOException {
        try (FileReader fr = new FileReader(path);
                BufferedReader br = new BufferedReader(fr)) {
            return br.readLine();
        }
    }

}
