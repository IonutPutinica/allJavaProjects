
public class ElevatorTest
{
   public static void main(String[] args) {
      Elevator elevator1 = new Elevator(2, 5);
      Elevator elevator2 = new Elevator(7, 3);
      
   //  elevator1.setMaximumLoad(5);
    // elevator1.setCurrentLoad(0);
     System.out.println(elevator1.getMaximumLoad()); //kg
     System.out.println(elevator1.getCurrentLoad()); //kg
     
     elevator1.personEnter(4);
     System.out.println(elevator1.getCurrentLoad());
     
     
     
     System.out.println(elevator1.isAllowedToMove());
   }
}
