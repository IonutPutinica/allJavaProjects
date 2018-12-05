
public class BlueCar implements Runnable
{
   private Lane lock;

   public BlueCar(Lane lock)
   {
      this.lock = lock;
   }

   @Override
   public void run()
   {
      while (true)
      {
         beforePassing(1000, 2000);
         lock.enterFromTheRight();
         passing(500, 1000);
         lock.exitToTheLeft();
         afterPassing(5000, 10000);
      }

   }

   private void passing(int minTime, int maxTime)
   {
      long time = (long) (Math.random() * (maxTime - minTime) + minTime);
      try
      {
         Thread.sleep(time);
      }
      catch (InterruptedException ie)
      {
         // TODO: handle exception
      }
   }

   private void afterPassing(int minTime, int maxTime)
   {
      long time = (long) (Math.random() * (maxTime - minTime) + minTime);
      try
      {
         Thread.sleep(time);
      }
      catch (InterruptedException ie)
      {
         // TODO: handle exception
      }
   }

   // sleep a random time in the interval [minTime, maxTime]
   private void beforePassing(int minTime, int maxTime)
   {
      long time = (long) (Math.random() * (maxTime - minTime) + minTime);
      try
      {
         Thread.sleep(time);
      }
      catch (InterruptedException ie)
      {
         // TODO: handle exception
      }
   }

}
