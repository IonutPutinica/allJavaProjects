
public class Tenant
{
   public String name;
   public String phone;
   public double rentDue;

   public Tenant(String name, String phone)
   {
      this.name = name;
      this.phone = phone;
      this.rentDue = 0;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getPhone()
   {
      return phone;
   }

   public void setPhone(String phone)
   {
      this.phone = phone;
   }

   public double getRentDue()
   {
      return rentDue;
   }

   public void setRentDue(double rentDue)
   {
      this.rentDue = rentDue;
   }

   public Tenant copy()
   {
      return new Tenant(this.name, this.phone);
   }

   public String toString()
   {
      return this.name + ","+ this.phone + ","+ this.rentDue;
   }

}
