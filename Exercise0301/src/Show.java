
public class Show implements Runnable
{
   private Clock clock;

   public Show(Clock clock)
   {
      this.clock = clock;
   }

   public void run()
   {
      for (int i = 0; i < 5 * 60; i++)
      {
         System.out.println();
         // and some code to pause for one second
      }
   }
}
