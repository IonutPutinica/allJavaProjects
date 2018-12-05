
public class Bicycle extends Vehicle
{
   private int gears;

   public Bicycle(String theOwner, double price, int numberOfGears)
   {
      super(theOwner, price);
      this.gears = numberOfGears;
   }

   public void setGears(int numberOfGears)
   {
      this.gears = numberOfGears;
   }

   public int getGears()
   {
      return gears;
   }

   public String toString()
   {
      return super.toString() + " Gears are= " + gears;
   }

   public boolean equals(Object arg)
   {
      if (!(arg instanceof Bicycle))
      {
         return false;
      }
      Bicycle other = (Bicycle) arg;
      return super.equals(arg) && gears == other.gears;
   }
}
