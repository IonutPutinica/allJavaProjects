
public class Vehicle extends Object
{
   private String owner;
   private double price;

   public Vehicle(String owner, double price)
   {
      super();
      this.owner = owner;
      this.price = price;
   }

   public String getOwner()
   {
      return owner;
   }

   public void setOwner(String theOwner)
   {
      this.owner = theOwner;
   }

   public double getPrice()
   {
      return price;
   }

   public void setPrice(double price)
   {
      this.price = price;
   }

   public String toString()
   {
      return "Owner is: " + owner + " and price is: " + price;
   }

   public boolean equals(Object arg)
   {
      if (!(arg instanceof Vehicle))
         return false;
      {
         Vehicle other = (Vehicle) arg;
         return owner.equals(other.owner) && price == other.price;
      }
   }
}
