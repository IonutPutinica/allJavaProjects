
public class Apartment extends Residence
{
   private int numberOfRooms;

   public Apartment(int number, double size, int numberOfRooms, String type)
   {
      super(number, size, type);
      this.numberOfRooms = numberOfRooms;
   }

   public int getNumberOfRooms()
   {
      return numberOfRooms;
   }
}
