
public class Van extends Car
{
   private int maxLoad;

   public Van(String theOwner, double thePrice, String regNo, int maxLoad)
   {
      super(theOwner, thePrice, regNo);
      this.maxLoad = maxLoad;
   }

   public int getMaxLoad()
   {
      return maxLoad;
   }

   public String toString()
   {
      return super.toString() + " The maximum load is=" + maxLoad;
   }

   public boolean equals(Object arg)
   {
      if (!(arg instanceof Van))
         return false;
      Van other = (Van) arg;
      {
         return other.equals(arg) && maxLoad == other.maxLoad;
      }

   }
}
