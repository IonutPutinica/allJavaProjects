
public class Tenant
{
   private MyDate RentedFrom;
   private String name;

   public Tenant(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return this.name;
   }

   public MyDate getRentedFrom()
   {
      return RentedFrom.copy();
   }

   public void setRentedFrom(MyDate date)
   {
      this.RentedFrom = date;
   }
}