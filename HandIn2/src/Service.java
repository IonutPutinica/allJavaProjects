
public class Service
{
   private int mileage;
   private Date date;

   public Service(int mileage, Date date)
   {
      this.mileage = mileage;
      this.date = date.copy();
   }

   public int getMileage()
   {
      return this.mileage;
   }

   public Date getDate()
   {
      return this.date.copy();
   }

   public boolean equals(Object obj)
   {
      if (obj instanceof Service)
      {
         Service other = (Service) obj;
         if (this.mileage == other.mileage && this.date.equals(other.date))
            return true;
      }
      return false;
   }

   @Override
   public String toString()
   {
      return "Service [mileage=" + mileage + ", date=" + date + "]";
   }

}
