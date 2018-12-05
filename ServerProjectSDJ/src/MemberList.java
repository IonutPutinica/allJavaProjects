import java.util.ArrayList;

public class MemberList
{

   private ArrayList<Member> MemberList;

   public MemberList()
   {

   }

   public void addMember(Member member)
   {
      this.MemberList.add(member);
   }
   
   public String getUnpaidMembers()
   {
      for (int i = 0; i < this.MemberList.size(); i++)
         if (member.getPayment() == false)
            return member.toString();
      return null;
   }

   public String getPaidMembers()
   {
      for (int i = 0; i < this.MemberList.size(); i++)
         if (member.getPayment() == true)
            return member.toString();
      return null;
   }

   public String getMembers()
   {
    
      for (int i = 0; i < this.MemberList.size(); i++)
         return member.toString();
      return null;
   }

  

   public int size()
   {
      return this.MemberList.size();
   }
}
