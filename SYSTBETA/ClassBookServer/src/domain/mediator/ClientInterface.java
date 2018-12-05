package domain.mediator;

import java.rmi.Remote;
import java.rmi.RemoteException;

import school.School;


public interface ClientInterface extends Remote
{
   public School receiveSchool(School school) throws RemoteException;
}
