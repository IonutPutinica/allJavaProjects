package main;
import java.io.Serializable;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import memberlist.domain.mediator.ClientInterface;
import memberlist.domain.mediator.ServerInterface;

public class Server extends UnicastRemoteObject implements ServerInterface, Serializable
{

	private static final long serialVersionUID = 1L;
	private static Server instance;
   private static MemberList list;
    

   private Server() throws RemoteException {
	   super();
	   list = new MemberList();
	   MemberProxy mihail = new MemberProxy("Mihail Kanchev", "1122334455");
	   MemberProxy flemse = new MemberProxy("Flemming Vindelev", "9988776655");
	   MemberProxy miru = new MemberProxy("Miruna Botusan", "0000000000");
	   MemberProxy ionut = new MemberProxy("Ionut-Christian", "420420420");
	   list.addMember(mihail);
      list.getMember(0).setPaid();
      list.addMember(flemse);
      list.addMember(miru);
      list.getMember(2).setPaid();
      list.addMember(ionut);
   }

   public static Server getInstance() throws RemoteException {
      if (instance == null)
         instance = new Server();
      return instance;
   }


   public String getUnpaidMembers(ClientInterface client) throws RemoteException {
	   String text = new String(list.getUnpaidMembers());
      client.printReply(text);
      return text;
   }

   public String getMembers(ClientInterface client) throws RemoteException {
	   String text = new String(list.getMembers());
      client.printReply(text);
      return text;
   }

   public String getPaidMembers(ClientInterface client) throws RemoteException {
      String text = new String(list.getPaidMembers());
      client.printReply(text);
      return text;
   }
   
   public static void main(String[] args) {

      try {
         Registry reg = LocateRegistry.createRegistry(1099);
         System.out.println("Starting registry...");
         ServerInterface rmiServer = new Server();
         Naming.rebind("flemmy", rmiServer);
         System.out.println("Starting server...");
      }

      catch (Exception ex) {
         ex.printStackTrace();
      }
   }

}
