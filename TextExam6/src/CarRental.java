import java.util.ArrayList;

public class CarRental
{
   private ArrayList<Car> carsForRent;
   private String companyName;
   private String address;

   public CarRental(String companyName, String address)
   {
      this.companyName = companyName;
      this.address = address;
   }

   public String getCompanyName()
   {
      return this.companyName;
   }

   public String getAddress()
   {
      return this.address;
   }

   public int getNumberOfCars()
   {
      return carsForRent.size();
   }

   public Car getCar(int index)
   {
      return carsForRent.get(index);
   }

   public Car getCarByLicense(String licenseNo)
   {
      int index = 0;
      for (int i = 0; i < carsForRent.size(); i++)
      {
         if (licenseNo == carsForRent.get(i).getLicenceNo())
         {
            index = i;
            break;
         }
      }

      return getCar(index);
   }
   public SportsCar getAvailableSportsCar()
   {
      int index=0;
     for(int i=0, i<carsForRent.size();i++)
     {
        if(carsForRent.get(i).getType()=="SportsCar" && carsForRent.get(i).isAvailable())
        index=i;
     }
     SportsCar sportscar=(SportsCar) carsForRent.get(index);
     return sportscar;
        
     }
   public Van getAvailableVan(int minCapacity)
   {
      int index=0;
      for(int i=0;i<carsForRent.size();i++)
      {
         if(carsForRent.get(i).getType()=="Van" && carsForRent.get(i).isAvailable())
         {
            Van van=(Van) carsForRent.get(i);
            if(minCapacity<=van.getCapacity())
               index=i;
         }
         
      }
      Van van=(Van) carsForRent.get(index);
      return van;
   }
}
