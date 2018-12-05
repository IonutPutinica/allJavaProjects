package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInterface extends Remote {
   
   void addMessage(Message msg) throws RemoteException;
   
}


