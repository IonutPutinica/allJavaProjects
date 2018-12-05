public class CarLaneSystemMain
{

   public static void main(String[] args)
   {

      Lane entireRoad = new Bridge();
      Thread[] red = new Thread[5];
      for (int i = 0; i < red.length; i++)
      {

         RedCar redCars = new RedCar(entireRoad);
         red[i] = new Thread(redCars, "Red car" + i);
         red[i].start();
      }
      Thread[] blue = new Thread[5];
      for (int i = 0; i < blue.length; i++)
      {

         BlueCar blueCars = new BlueCar(entireRoad);
         blue[i] = new Thread(blueCars, "Blue car" + i);
         blue[i].start();
      }
   }
}