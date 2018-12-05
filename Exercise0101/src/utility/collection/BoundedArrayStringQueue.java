package utility.collection;

public class BoundedArrayStringQueue implements StringQueueADT {

   private String[] queue;
   private int count;
   private int front;
   
   public BoundedArrayStringQueue(int capacity) {
      queue = new String[capacity];
      front = 0;
      count = 0;
   }
   
   public void enqueue(String element) throws IllegalStateException {
      queue[count+front] = element;
      count++;
   }
   
   public String dequeue() {
      String element = queue[front];
      queue[front]=null;
      front++;
      count--;
      return element;
   }
   
   public String first() throws IllegalStateException {
      return queue[front];
   }
   
   public int indexOf(String element) {
      int index = 0;
      for(int i=front; i<count+front; i++) {
         if(queue[i].equals(element)) {
            index = i-front+1;
            return index;
         }        
      }
      return -1;     
   }
   
   public boolean isEmpty() {
      if(count==0) return true;
      else return false;
   }
   
   public int size() {
      return count;
   }
   
   public String toString() {
      String string = "{";
      for(int i=front; i<count+front-1; i++) {
         string = string + queue[i] + ", ";
      }
      string = string + queue[count+front-1]+"}";
      return string;
   }
   
}
