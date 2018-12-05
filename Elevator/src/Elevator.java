public class Elevator {

   private int floor;
   private int capacity;
   private int maximumLoad;
   private int currentLoad;

   public Elevator(int floor, int capacity) {
      this.floor = floor;
      this.capacity = capacity;
      this.maximumLoad = 75 * capacity;
      this.currentLoad = 0;
   }

   public int getFloor() {
      return floor;
   }

   public int getCapacity() {
      return capacity;
   }

   public int getMaximumLoad() {
      return maximumLoad;
   }

   public int getCurrentLoad() {
      return currentLoad;
   }

   public void personEnter() {
      this.currentLoad += 75;
   }

   public void personEnter(int weight) {
      this.currentLoad += weight;
   }

   public void personExit() {
      if (this.currentLoad - 75 > 0)
         this.currentLoad -= 75;
      else
         System.out.println("No standard persone inside");
   }

   public void personExit(int weight) {
      if (this.currentLoad - weight > 0)
         this.currentLoad -= weight;
      else
         System.out.println("No such person inside");
   }
   
   public boolean isAllowedToMove() {
      if(this.currentLoad <= maximumLoad)
         return true;
      else
         return false;
   }
   
   public boolean moveToFloor(int floor) {
      if(this.isAllowedToMove()) {
         this.floor = floor;
         return true;
      }else
         return false;
   }
   
}