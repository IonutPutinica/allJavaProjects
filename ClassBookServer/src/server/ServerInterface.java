package server;
import java.rmi.Remote;
import java.rmi.RemoteException;

import domain.mediator.ClientInterface;
import school.Course;
import school.School;
import teacher.TeacherList;

public interface ServerInterface extends Remote
{
   //public void getSchool(ClientInterface client) throws RemoteException;
   public void printMessage(String msg) throws RemoteException;
}
