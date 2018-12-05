package rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class RmiServer implements ServerInterface {
   
   private ArrayList<Message> list;
   
   public RmiServer() throws RemoteException {
      list = new ArrayList<>();
      UnicastRemoteObject.exportObject(this, 0);
      System.setProperty("java.security.policy","file:./all.policy");
   }
   
   @Override
   public void addMessage(Message msg) throws RemoteException {
      list.add(msg);
      System.out.println(msg.getNickname() + "> " + msg.getBody());
   }
   
   public static void main(String[] args) {
      try {
         
         LocateRegistry.createRegistry(1099);
         RmiServer server = new RmiServer();
         
         if (System.getSecurityManager() == null) {
               System.setSecurityManager(new RMISecurityManager());
         }
         
         Naming.rebind("msgList", server);
         
         System.out.println("Starting server...");
      }
      catch (Exception ex) { ex.printStackTrace(); }  
   }
}
