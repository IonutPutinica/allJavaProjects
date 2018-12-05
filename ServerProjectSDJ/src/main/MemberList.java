package main;
import java.io.Serializable;
import java.util.ArrayList;

public class MemberList implements Serializable
{

   private ArrayList<MemberProxy> memberlist;
   private static final long serialVersionUID = 1L;
   
   public MemberList() {
	   memberlist = new ArrayList<MemberProxy>();
   }

   public void addMember(MemberProxy realMember) {
      memberlist.add(realMember);
   }
   
   public String getUnpaidMembers() {
      String text = new String();
      for (int i = 0; i < memberlist.size(); i++) {
         if (memberlist.get(i).getPayment() == false) {
            text += memberlist.get(i).toString() + "\n";
         }
      }
      return text;
   }

   public String getPaidMembers() {
      String text = new String();
      for (int i = 0; i < memberlist.size(); i++)
         if (memberlist.get(i).getPayment() == true) {
            text += memberlist.get(i).toString() + "\n";
         }
      return text;
   }

   public String getMembers() {
      String text = new String();
      for (int i = 0; i < memberlist.size(); i++) {
         text += memberlist.get(i).toString() + "\n";
      }
      return text;
   }

   public MemberProxy getMember(int i) {
	   return memberlist.get(i);
   }
   
   public int size() {
      return memberlist.size();
   }
}
