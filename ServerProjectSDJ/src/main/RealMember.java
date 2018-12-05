package main;
import java.io.Serializable;

public class RealMember implements Serializable, Member
{
   private Name name;
   private String cpr;
   private boolean isPaid;
   private static final long serialVersionUID = 1L;
   
   public RealMember(String name, String cpr) {
      this.name = NameFactory.getMember(name);
      this.cpr = cpr;
   }
   public void setPaid() {
      isPaid = true;
   }
   public void setUnpaid() {
      isPaid = false;
   }
   public boolean getPayment() {
      return isPaid;
   }
   public String getCPR() {
      return cpr;
   }
   public String getName() {
      return name.toString();
   }
   public String toString() {
      return name.toString() + " / " + cpr + " / " + "Paid: " + isPaid;
   }
   public void setName(String name) {
      this.name.setName(name);
   }
   
   public void setCPR(String cpr) {
      this.cpr = cpr;
   }
}
