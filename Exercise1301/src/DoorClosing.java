
public class DoorClosing extends DoorState
{

   @Override
   public void click(Door door)
   {
      door.setState(new DoorOpening());
   }

   public void complete(Door door)
   {
      door.setState(new DoorClosed());
   }

}
