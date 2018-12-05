
public class Member
{
   private String name;
   private boolean isPaid;
   private String cpr;
   public Member(String name,String cpr)
   {
      this.name=name;
      this.cpr=cpr;
   }
   public void setPaid()
   {
      isPaid=true;
   }
   public void setUnpaid()
   {
      isPaid=false;
   }
   public boolean getPayment()
   {
      return isPaid;
   }
   public String getCPR()
   {
      return cpr;
   }
   public String getName()
   {
      return name;
   }
   public String toString()
   {
      return "The name is=" +name + " the CPR=" + cpr+" and the member has paid "+ getPayment();
   }
}
