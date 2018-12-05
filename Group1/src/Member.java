import java.util.Random;

public class Member extends Person
{
   private Date dateMembership;
   private String paymentYear;
   private boolean hasPaid;
   private int id;
   private Random random = new Random();
   
   public Member(String name, Date dateMembership) {
      super(name);
      this.dateMembership = dateMembership;
      id = random.nextInt(10000);
   }
   public String getPaymentYear() {
      return paymentYear;
   }
   public void setPaymentYear(String paymentYear) {
      this.paymentYear = paymentYear;
   }
   public Date getDateMembership() {
      return dateMembership;
   }
   public boolean hasPaid() {
      return hasPaid;
   }
   public void setPayment(boolean hasPaid) {
      this.hasPaid = hasPaid;
   }
   public int getId() {
      return id;
   }
   public boolean equals(Object obj) {
      if(!(obj instanceof Member)) {
         return false;
      }
      else {
         Member other = (Member) obj;
         return super.equals(other) && id == other.id;
      }
   }
   public String toString() {
      return super.toString() + ", Date of membership: " + dateMembership;
   }
}
