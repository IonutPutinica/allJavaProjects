package memberlist.domain.mediator;
import java.rmi.Remote;
import java.rmi.RemoteException;

import main.MemberListView;

public interface ServerInterface extends Remote
{
   public String getPaidMembers(ClientInterface client) throws RemoteException;

   public String getUnpaidMembers(ClientInterface client) throws RemoteException;

   public String getMembers(ClientInterface client) throws RemoteException;

   

}
