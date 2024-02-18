/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmitest;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author hp
 */
public class ApplicationServer {
    
    
    
    public static void main(String[] args) throws RemoteException {
        
        Registry r = LocateRegistry.createRegistry(5099); 
        r.rebind("hallo",new HalloServer()); 
          // "rmi://localhost:5099/hello"
        
    }
}
