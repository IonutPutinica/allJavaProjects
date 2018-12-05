package domain.mediator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Client extends UnicastRemoteObject implements ClientInterface
{
   private static final long serialVersionUID = 1L;
   private ServerInterface server;
   
   public Client() throws RemoteException, MalformedURLException, NotBoundException {
      super();
      server = (ServerInterface) Naming.lookup("rmi://localhost/ClassBook");
   }
}
