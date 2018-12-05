import java.util.ArrayList;

import javax.management.relation.RelationServiceNotRegisteredException;

public class ApartmentComplex
{
   private String address;
   private ArrayList<Residence> residences;

   public ApartmentComplex(String address)
   {
      this.address = address;
      residences = new ArrayList<Residence>();
   }

   public int getNumberOfResidences()
   {
      return residences.size();
   }

   public void add(Residence residence)
   {
      residences.add(residence);
   }

   public Residence getResidence(int index)
   {
      return residences.get(index);
   }

   public Residence getResidenceByNumber(int number)
   {
      int num = 0;
      for (int i = 0; i < residences.size(); i++)
      {

         if (residences.get(i).getNumber() == number)
            num = i;

      }

      return residences.get(num);
   }

   public Room getFirstAvailableRoom()
   {
      int num = 0;
      for (int i = 0; i < residences.size(); i++)
      {
         if (residences.get(i) instanceof Room)
         {
            if (residences.get(i).isAvailable())
               num = i;
         }
      }
      Room room = (Room) residences.get(num);
      return room;
   }
   public Apartment getFirstAvailableApartment(int minNoOfRooms)
   {
      int num=0;
      for(int i=0;i<residences.size();i++)
      {
         if(residences.get(i) instanceof Apartment)
         {
            if(residences.get(i).getNumberOfRooms()>=minNoOfRooms)
               num=i;
         }
      }
      Apartment apt=(Apartment) residences.get(num);
      return apt;
   }
}
