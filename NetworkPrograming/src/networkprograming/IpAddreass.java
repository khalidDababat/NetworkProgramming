/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkprograming;

import java.net.InetAddress;

/**
 *
 * @author hp
 */
public class IpAddreass {
     public static void main(String[] args) {

        try {
            InetAddress Address = InetAddress.getByName("www.FaseBook.com");
            System.out.println(Address);
            System.out.println(Address.getCanonicalHostName() );
            System.out.println(Address.getHostAddress());
            System.out.println(Address.getHostName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
