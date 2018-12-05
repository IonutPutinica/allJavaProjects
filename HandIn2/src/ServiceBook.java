import java.util.ArrayList;

public class ServiceBook
{

   private ArrayList<Service> services;

   public ServiceBook()
   {
      this.services = new ArrayList<Service>();
   }

   public void addService(Service service)
   {
      this.services.add(service);
   }

   public int getNumberOfServices()
   {
      return this.services.size();
   }

   public Service getService(int index)
   {
      return this.services.get(index);
   }

   public Service[] getAllServices()
   {
      Service[] array = new Service[this.services.size()];

      for (int i = 0; i < this.services.size(); i++)
         array[i] = this.services.get(i);
      return array;
   }

   public int[] getAllServicesMileage()
   {
      int[] array = new int[services.size()];

      for (int i = 0; i < services.size(); i++)
         array[i] = services.get(i).getMileage();

      return array;
   }

   public boolean hasServiceOnDate(Date date)
   {
      for (Service e : services)
      {
         if (e.getDate().equals(date))
            return true;
      }
      return false;
   }

   public Date getDateOfLastService()
   {
      return this.services.get(services.size() - 1).getDate();
   }

   @Override
   public boolean equals(Object obj)
   {
      if (obj instanceof ServiceBook)
      {
         ServiceBook other = (ServiceBook) obj;
         if (this.services.size() != other.services.size())
            return false;
         for (int i = 0; i < this.services.size(); i++)
            if (!this.services.get(i).equals(other.services.get(i)))
               return false;
         return true;
      }
      return false;
   }

   public String toString()
   {
      StringBuilder sb = new StringBuilder("");

      sb.append("\nServiceBook:");
      for (int i = 0; i < this.services.size(); i++)
         sb.append("\n" + (i + 1) + ". " + this.services.get(i));

      return sb.toString();
   }

}
