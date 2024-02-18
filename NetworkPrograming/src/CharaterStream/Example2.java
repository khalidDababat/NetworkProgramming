package CharaterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
    // static final String dataFile = "F://Java//DataStreams//invoicedata.txt";

    static final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
    static final int[] units = {12, 8, 13, 29, 50};
    static final String[] descs = {
        "Java T-shirt",
        "Java Mug",
        "Duke Juggling Dolls",
        "Java Pin",
        "Java Key Chain"
    };

    public static void main(String[] args) throws FileNotFoundException, IOException {

        DataOutputStream out = new DataOutputStream(new FileOutputStream("test.txt"));

        for (int i = 0; i < prices.length; i++) {
            out.writeDouble(prices[i]);
            out.writeInt(units[i]);
            out.writeUTF(descs[i]);
        }

        out.close();

        double price;
        int unit;
        String desc;
        double total = 0.0;

        try {

            DataInputStream in = new DataInputStream(new FileInputStream("test.txt"));
            while (true) {
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();

                System.out.format("You ordered %d" + " units of %s at $%.2f%n",
                        unit, desc, price);
                total += unit * price;
            }

        } catch (IOException e) {
        }

        System.out.format("Your total is %f", total);

    }

}
