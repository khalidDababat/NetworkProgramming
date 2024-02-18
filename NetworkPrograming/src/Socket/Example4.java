package Socket;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Example4 {

    public static void main(String[] args) throws IOException {

        ServerSocket serversocket = null;

        try {
            serversocket = new ServerSocket(5555);
            System.out.println("");
        } catch (IOException e) {

            System.out.println("can not connect please Check port NO.");
        }
        Socket socket = null;
        try {
            socket = serversocket.accept();
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("can not accept the Connection .");

        }

        InputStream in = null;
        OutputStream out = null;
        try {
            in = socket.getInputStream();

        } catch (IOException e) {
            System.out.println("can not Get input Stream OR (Socket Error )");

        }

        try {
            out = new FileOutputStream("C:\\Users\\hp\\Desktop\\MyFiles\\name.txt");

        } catch (FileNotFoundException e) {
            System.out.println("FIle Not Found!");

        }
        
        byte[] b = new byte[20*1024];//20*1024
        
        
       int i ; 
       while((i=in.read(b) )> 0){
           out.write(b, 0, i);
           
       } 
        
        out.close();
        in.close();
        socket.close(); 
        serversocket.close();

        
    }

}
