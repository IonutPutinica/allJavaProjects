package server;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import domain.mediator.ClientInterface;
import school.Course;
import school.School;
import teacher.Teacher;
import teacher.TeacherList;

public class Server extends UnicastRemoteObject implements ServerInterface
{
   private static final long serialVersionUID = 1L;
   private static Server instance;
   
   public Server() throws RemoteException, MalformedURLException {
      super();
      startRegistry();
      Naming.rebind("ClassBook", this);
      System.out.println("Starting server...");
      
   }
   
   private void startRegistry() throws RemoteException{
      try {
         Registry reg = LocateRegistry.createRegistry(1099);
         System.out.println("Starting registry...");
      }

      catch (Exception ex) {
         ex.printStackTrace();
      }
   }
   
   public static Server getInstance() throws RemoteException, MalformedURLException {
      if(instance == null)
         instance = new Server();
      return instance;
   }
   
   public void printMessage(String msg) {
      System.out.println(msg);
   }

   /*public void getSchool(ClientInterface client) throws RemoteException
   {
      client.receiveSchool(school);
   }*/
   
}
