
public abstract class Car
{
   private String licenseNo;
   private double price;
   private Customer customer;

   public Car(String licenseNo, double price)
   {
      this.licenseNo = licenseNo;
      this.price = price;
   }

   public String getLicenceNo()
   {
      return this.licenseNo;
   }

   public double getPrice()
   {
      return this.price;
   }

   public void setPrice(double price)
   {
      this.price = price;
   }

   public abstract String getType();

   public Customer getRentedTo()
   {
      return this.customer;
   }

   public void setRentedTo(Customer customer)
   {
      this.customer = customer;
   }

   public boolean isAvailable()
   {
      if (customer == null)
      {
         return true;

      }
      else
      {
         return false;
      }
   }

}
