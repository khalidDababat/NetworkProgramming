/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmitest;

import java.rmi.RemoteException;
import java.rmi.UnexpectedException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author hp
 */
public class HalloServer extends  UnicastRemoteObject implements HalloServese{

    public HalloServer() throws RemoteException{
      super(); 
     }
    
    
    @Override
    public String echo(String input) throws RemoteException {

         return "From Server:"+input ; 



    }
    
}
