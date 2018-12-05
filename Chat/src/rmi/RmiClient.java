package rmi;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RmiClient {
   private ServerInterface server;
   private static final String NICKNAME = "Wikileaks";
   
   public RmiClient() throws MalformedURLException, RemoteException, NotBoundException {
      server = (ServerInterface) Naming.lookup("rmi://10.152.212.144:1099/msgList");
      System.setProperty("java.security.policy","file:./all.policy");
   }
   
   public void addMessageToServer(Message msg) throws RemoteException {
      server.addMessage(msg);
   }
   
   public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
      
      RmiClient rmc = new RmiClient();
      
      if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
      }
      
      Scanner keyb = new Scanner(System.in);
      String input = "";
      
      System.out.println("You can start writing to server: ");
      
      while(!input.equals("Exit")) {
         input = keyb.nextLine();
         rmc.addMessageToServer(new Message(NICKNAME, input));
      }
      keyb.close();
   }
}



