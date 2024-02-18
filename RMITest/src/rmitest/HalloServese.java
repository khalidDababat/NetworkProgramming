/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmitest;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author hp
 */
public interface HalloServese extends Remote {
    
    
    public String echo(String input) throws RemoteException; 
    
    
    
}
