import java.util.ArrayList;
public class MemberList
{
   private ArrayList<Member> members;
   
   public MemberList() {
      members = new ArrayList<Member>();
   }
   
   public void addMember(Member member) {
      members.add(member);
   }
   public Member[] getMembers() {
      Member[] mb = new Member[members.size()];
      for(int i = 0; i < members.size(); i++) {
         mb[i] = members.get(i);
      }
      return mb;
   }
   public void removeMember(Member member) {
      for(int i = 0; i < members.size(); i++) {
         if(member.equals(members.get(i))) {
            members.remove(i);
         }
      }
   }
}
