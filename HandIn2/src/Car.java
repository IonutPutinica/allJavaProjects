public class Car
{

   private String registrationNumber;
   private int mileage;
   private ServiceBook serviceBook;

   public Car(String registrationNumber, int mileage)
   {
      this.registrationNumber = registrationNumber;
      this.mileage = mileage;
      this.serviceBook = new ServiceBook();
   }

   public String getRegistrationNumber()
   {
      return registrationNumber;
   }

   public int getMileage()
   {
      return mileage;
   }

   public ServiceBook getServiceBook()
   {
      return serviceBook;
   }

   public void setRegistrationNumber(String registrationNumber)
   {
      this.registrationNumber = registrationNumber;
   }

   public void drive(int mileage)
   {
      if (mileage > 0)
         this.mileage += mileage;
   }

   public void service()
   {
      this.serviceBook.addService(new Service(this.mileage, new Date()));
   }

   public void service(Date date)
   {
      this.serviceBook.addService(new Service(this.mileage, date));
   }

   public boolean equals(Object obj)
   {
      if (obj instanceof Car)
      {
         Car other = (Car) obj;
         if (this.mileage == other.mileage
               && this.registrationNumber.equals(other.registrationNumber)
               && this.serviceBook.equals(other.serviceBook))
            return true;
      }
      return false;
   }

   public String toString()
   {
      return "Registration number: " + this.registrationNumber + "\nMileage:"
            + this.mileage + this.serviceBook;
   }

}
