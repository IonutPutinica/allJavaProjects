
public abstract class Room
{
   private int number;
   private Guest guest;
   private Bed bed;

   public Room(int number, String bedType)
   {
      this.number = number;
      this.bed = new Bed(bedType);
   }

   public int getNumber()
   {
      return number;
   }

   public int getFloor()
   {
      return number / 100;
   }

   public abstract double getPrice();
   
   public boolean isOccupied()
   {
      if (guest.getName().equals(null))
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   public void registerGuest(Guest guest)
   {
      this.guest = guest;
   }

   public void vacate()
   {
      this.guest = null;
   }

   public String getBedType()
   {
      if (this.bed.isSingle() == true)
         return "Single";
      else if (this.bed.isDouble() == true)
         return "Double";
      else
         return "King size";

   }
   public Guest getGuest()
   {
      return this.guest;
   }
}
