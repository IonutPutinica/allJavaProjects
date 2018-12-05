
public class Suite extends Room
{
private int noOfRooms;
public Suite(int noOfRooms,int number)
{
   super(number,"kingsize");
   this.noOfRooms=noOfRooms;
}
public double getPrice()
{
   if(this.noOfRooms==2)
      return 120.00;
   if(this.noOfRooms==3)
      return 160.00;
   else
      return 160+30*(this.noOfRooms-3);
}
public int getNumberOfRooms()
{
   return this.noOfRooms;
}
}
