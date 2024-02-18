package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.Buffer;

public class Example1 {

    public static void main(String[] args) throws IOException {

        String Host = "www.facebook.com";
      

        Socket socket = new Socket( Host, 80);

        OutputStream os = socket.getOutputStream();

        boolean autoflush = true;

        PrintWriter out = new PrintWriter(socket.getOutputStream(), autoflush);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out.println("GET/ HTTP/1.1");
        out.println("HOST:" + Host + ":80");
        out.println("Connection : Close");
        out.println("");

        boolean loop = true;
        StringBuilder sp = new StringBuilder(8192);// 1024*8 

        while (loop) {
            if (in.ready()) {
                int n = 0;
                while (n != -1) {
                    n = in.read();
                    sp.append((char) n);

                }
                loop = false; // until stop loop when stop Reading 
            }
        }

        System.out.println(sp.toString());
        socket.close();
        os.close();
        
        
    }

}
