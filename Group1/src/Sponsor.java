
public class Sponsor extends Person
{
   private double moneyContributed;
   
   public Sponsor(String name, double moneyContributed) {
      super(name);
      this.moneyContributed = moneyContributed;
   }
   public void addContribution(double contribution) {
      moneyContributed += contribution;
   }
   public double getMoneyContributed() {
      return moneyContributed;
   }
   public boolean equals(Object obj) {
      if(!(obj instanceof Sponsor)) {
         return false;
      }
      else {
         Sponsor other = (Sponsor) obj;
         return super.equals(other) && moneyContributed == other.moneyContributed;
      }
   }
   public String toString() {
      return super.toString() + ", Money contributed: " + moneyContributed;
   }
}
