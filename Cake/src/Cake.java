public class Cake {

   private String name;
   private double weight;
   private double amountLeft;
   private double orginalWeight;

   public Cake(String name, double weight) {
      this.name = name;
      this.weight = this.orginalWeight = weight;
      this.amountLeft = 100;
   }

   public String getName() {
      return name;
   }

   public double getWeight() {
      return weight;
   }
   
   public double getAmountLeft() {
      return amountLeft;
   }

   public void eatPercentageAmount(double percentage) {
      this.amountLeft -= percentage;
      this.weight -= (this.orginalWeight * this.amountLeft / 100);
      if(this.weight < 0)
         this.weight = 0;
      if(this.amountLeft < 0)
         this.amountLeft = 0;
   }

   public void eatAmount(double weight) {
      this.weight -= weight;
      this.amountLeft = (this.weight/this.orginalWeight*100);
      if(this.weight < 0)
         this.weight = 0;
      if(this.amountLeft<0)
         this.amountLeft =0;
   }

   public boolean isCakeGone() {
      if(this.amountLeft == 0)
         return true;
      else
         return false;
   }
   
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (!(obj instanceof Cake))
         return false;
      Cake other = (Cake) obj;
      if (Double.doubleToLongBits(amountLeft) != Double.doubleToLongBits(other.amountLeft))
         return false;
      if (name == null) {
         if (other.name != null)
            return false;
      } else if (!name.equals(other.name))
         return false;
      if (Double.doubleToLongBits(orginalWeight) != Double.doubleToLongBits(other.orginalWeight))
         return false;
      if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
         return false;
      return true;
   }

   //Both eating methods can be combined into one eat(),
   //but it violates single responsibility principle  
   public void eat(double amount, char unit) {
      if(unit == 'g')
         eatAmount(amount);
      else if(unit == '%')
         eatPercentageAmount(amount);
      else
         System.out.println("Wrong unit!");
   }
   
   public static Cake makeRumBall(Cake first, Cake second) {
      return new Cake("Rum Ball", first.weight+second.weight);
   }
   
   @Override
   public String toString() {
      return "Cake [name=" + name + ", weight=" + weight + ", amountLeft=" + amountLeft + ", orginalWeight="
            + orginalWeight + "]";
   }
}