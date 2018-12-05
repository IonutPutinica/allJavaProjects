
public class Apartment
{
   private String adress;
   private double rent;
   private Tenant tenant;

   public Apartment(String adress, double rent)
   {
      this.adress = adress;
      this.rent = rent;
      this.tenant = null;
   }

   public String getAdress()
   {
      return adress;
   }

   public double getRent()
   {
      return rent;
   }

   public void setRent(double rent)
   {
      this.rent = rent;
   }

   public boolean isOccupied()
   {
      if (tenant == null)
      {
         return false;

      }
      else
         return true;
   }

   public void rentTo(String name, String phone)
   {
      if (!isOccupied())
      {
         this.tenant = new Tenant(name, phone);
      }
   }

   public void evict()
   {
      tenant = null;
   }

   public Tenant getTenant()
   {
      if (tenant == null)
      {
         return this.tenant.copy();
      }
      return new Tenant("", "");
   }

   public double getRentDue()
   {
      if (!isOccupied())
         return tenant.getRentDue();
      else
         return 0;
   }
   public void chargeRent()
   {
      if(!isOccupied())
         this.tenant.setRentDue(this.tenant.getRentDue()+this.rent);
   }
   public void collectRent()
   {
      if(!isOccupied())
         this.tenant.setRentDue(this.tenant.getRentDue()-this.rent);
   }
   public String toString()
   {
      return "adress="+this.adress+ " rent="+ this.rent+ " tenant="+ (this.tenant == null ? "No tenant" : this.tenant.toString());
   }
   
}
