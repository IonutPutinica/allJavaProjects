package threads.producerconsumer.queues;

public class Car implements Runnable
{
   private WashingHall washingHall;

   public Car(WashingHall washingHall)
   {
      this.washingHall = washingHall;
   }

   @Override
   public void run()
   {
      Hall hall = washingHall.enterForWashing();
      System.out.println("Car entered washing hall:" + hall.getNumber());
      try
      {
         Thread.sleep(1000);
      }
      catch (InterruptedException ie)
      {
         // TODO: handle exception
      }
      washingHall.leaveWashing(hall);
      System.out.println("Car leaving washing hall:" + hall.getNumber());
   }
}
