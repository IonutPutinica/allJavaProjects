package memberlist.domain.mediator;
import java.rmi.RemoteException;
import main.MemberListView;

import java.rmi.Remote;

public interface ClientInterface extends Remote {
   public void printReply(String msg) throws RemoteException;
}
