package main;


import java.rmi.RemoteException;

public class ClientMemberListController
{
   private Model model;
   private MemberListView view;
   
   public ClientMemberListController(Model model, MemberListView view) {
      this.model = model;
      this.view = view;
   }
   public void execute(int choice) throws RemoteException{
      switch(choice) {
         case 1: model.getMembers(view);
                 break;
         case 2: model.getUnpaidMembers(view);
                 break;
         case 3: model.getPaidMembers(view);
                 break;
         case 0: System.exit(1);
                 break;
      }
   }
}
