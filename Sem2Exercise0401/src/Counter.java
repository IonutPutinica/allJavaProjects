
public class Counter implements Interface
{
   private long value;
   private long max;
   private long min;

   public Counter(long min, long max)
   {
      this.value = 0;
      this.min = min;
      this.max = max;
   }

   public synchronized void increment()
   {

      while (value + 1 <= max)
      {
         try
         {
            wait();
         }
         catch (InterruptedException e)
         {

         }
      }
      value++;
      notifyAll();
   }

   public synchronized void decrement()
   {
      while (value - 1 >= max)
      {
         try
         {
            wait();
         }
         catch (InterruptedException e)
         {

         }
      }
      value--;
      notifyAll();
   }

   public long getValue()
   {
      return value;
   }

   @Override
   public void run()
   {
     for(updates=0;updates<=value;updates++)
     {
        
     }
   }
}
