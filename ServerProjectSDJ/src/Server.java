import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements ServerInterface
// Singleton implementation
{
   private static Server instance;

   private Server() throws RemoteException
   {

   }

   public static Server getInstance() throws RemoteException
   {
      if (instance == null)
         instance = new Server();
      return instance;
   }
   // Singleton implementation ends

   @Override
   public String getUnpaidMembers()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public String getMembers()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void setPaid(String cpr)
   {
      // TODO Auto-generated method stub

   }

   @Override
   public void setUnpaid(String cpr)
   {
      // TODO Auto-generated method stub

   }

   @Override
   public String getPaidMembers()
   {
      // TODO Auto-generated method stub
      return null;
   }

   public static void main(String[] args)
   {

      try
      {
         Registry reg = LocateRegistry.createRegistry(1099);
         System.setProperty("java.security.policy", "security.policy");
         ServerInterface rmiServer = new Server();
         Naming.rebind("RMIServer", rmiServer);
         System.out.println("Starting server...");
      }

      catch (Exception ex)
      {
         ex.printStackTrace();
      }
   }

}
