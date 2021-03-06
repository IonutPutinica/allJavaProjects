
public class Writer implements Runnable
{
   private ReadWrite lock;

   public Writer(ReadWrite lock)
   {
      this.lock = lock;
   }

   @Override
   public void run()
   {
      beforeWriting(1000, 2000);
      lock.acquireRead();
      writing(500, 1000);
      lock.releaseRead();
      afterWriting(5000, 10000);

   }

   private void afterWriting(int minTime, int maxTime)
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

   private void writing(int minTime, int maxTime)
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
   private void beforeWriting(int minTime, int maxTime)
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
