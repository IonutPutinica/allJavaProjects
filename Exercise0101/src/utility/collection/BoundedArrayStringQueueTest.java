package utility.collection;

public class BoundedArrayStringQueueTest {

   public static void main(String[] args) {
      
      BoundedArrayStringQueue queue = new BoundedArrayStringQueue(9);
      queue.enqueue("a");
      queue.enqueue("b");
      queue.enqueue("c");
      queue.enqueue("d");
      System.out.println(queue.toString());
      queue.dequeue();
      System.out.println(queue.toString());
      queue.dequeue();
      System.out.println(queue.toString());
      queue.enqueue("e");
      System.out.println(queue.toString());
      System.out.println(queue.isEmpty());
      System.out.println(queue.first());
      System.out.println(queue.indexOf("e"));
      queue.dequeue();
      queue.dequeue();
      queue.dequeue();
      System.out.println(queue.isEmpty());
      System.out.println(queue.toString());
      
   }

}
