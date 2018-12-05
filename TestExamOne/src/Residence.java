
public abstract class Residence
{
   private int number;
   private double size;
   private String type;
   private Tenant rentedTo;

   public Residence(int number, double size, String type)
   {
      this.number = number;
      this.size = size;
      this.type = type;
   }

   public int getNumber()
   {
      return this.number;
   }

   public String getType()
   {
      return this.type;
   }

   public boolean isAvailable()
   {
      if (rentedTo == null)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   public void rentTo(Tenant tenant, MyDate rentedFrom)
   {
      this.rentedTo=tenant;
      this.rentedTo.setRentedFrom(rentedFrom);
   }
   public Tenant getTenant()
   {
      return this.getTenant();
   }
   public abstract int getNumberOfRooms();
   
      
   
}
