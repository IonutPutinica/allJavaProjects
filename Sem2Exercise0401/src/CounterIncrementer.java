
public class CounterIncrementer 
{
   private int updates;
   public CounterIncrementer(Counter counter, int updates)
   {
      this.updates=updates;
      counter.increment();
   }
}
