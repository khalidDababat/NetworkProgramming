
package RMIExample;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

   /* 
    UnicastRemoteObject     & MultiCastRemoteObject
 
   */
public class AdderRemote extends UnicastRemoteObject implements Adder {
    
    public AdderRemote() throws RemoteException{
        
     super();    
    }
    
    
    
    @Override
    public int add(int x,int y)
    {
        return x+y;
    
    }


    
    

}  

