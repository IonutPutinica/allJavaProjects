package main;


import java.rmi.RemoteException;

public interface Model
{
   public void getPaidMembers(MemberListView view) throws RemoteException;
   public void getUnpaidMembers(MemberListView view) throws RemoteException;
   public void getMembers(MemberListView view) throws RemoteException;
}
