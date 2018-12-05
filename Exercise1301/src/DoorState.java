
public abstract class DoorState
{

   public abstract void click(Door door);

   public void complete(Door door)
   {
      // Nothing
   }

   public void timeout(Door door)
   {
      // Nothing
   }

   public String status()
   {
      return getClass().getSimpleName();
   }
}
