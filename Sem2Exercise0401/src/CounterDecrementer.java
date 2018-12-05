
public class CounterDecrementer
{
   private int updates;
   public CounterDecrementer(Counter counter, int updates)
   {
      this.updates=updates;
      counter.decrement();
   }
}
