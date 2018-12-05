
public class Hotel
{
   private String name;
   private Room rooms[];

   public Hotel(String name, Room[] rooms)
   {
      this.name = name;
      this.rooms = rooms;
   }

   public String getName()
   {
      return this.name;
   }

   public int getNumberOfRooms()
   {
      return this.rooms.length;
   }

   public int getNumberOfAvailableRooms()
   {
      int index = 0;
      for (int i = 0; i < rooms.length; i++)
      {
         if (rooms[i].isOccupied() == false)
            index++;
      }
      return index;
   }

   public Room getFirstAvailableRoom()
   {
      for (int i = 0; i < this.rooms.length; i++)
      {
         if (this.rooms[i].isOccupied() == false)
            return this.rooms[i];

      }
      return null;
   }

public Room getFirstAvailableRoom(double maxPrice)
{
   for(int i=0;i<this.rooms.length;i++)
   {
      if((this.rooms[i].isOccupied()==false)&& (this.rooms[i].getPrice()<maxPrice))
         return this.rooms[i];
   }
   return null;
}

}
