
public class ArrayQueue<T> implements QueueADT
{

   private static int DEFAULT_CAPACITY = 100;
   private int front;
   private int count;
   private T[] queue;

   public ArrayQueue()
   {
      this.front = 0;
      this.count = 0;
      this.queue = (T[]) new Object[DEFAULT_CAPACITY];
   }

   public ArrayQueue(int initialCapacity)
   {

      this.front = 0;
      this.count = 0;
      queue = (T[]) new Object[initialCapacity];

   }

   public void expandCapacity()
   {

   }

   @Override
   public String toString()
   {
      String result = "{";

      for (int i = front, x = 0; x < count; i = (i + 1) % queue.length, x++)
         result += queue[i].toString() + ", ";

      return result + "}";

   }

@Override
public void enqueue(Object element) {
   this.queue
   
}

   @Override
   public Object dequeue()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public Object first()
   {

   }

   @Override
   public int indexOf(Object element)
   {

      for (int i = front, x = 0; x < count; i = (i + 1) % queue.length, x++)
         if (queue[i].equals(element))
         {
            return i;
         }
      return -1;

   }

   @Override
   public boolean isEmpty()
   {

      if (count == 0)
         return true;
      else
         return false;

   }

   @Override
   public int size()
   {

      return this.count;

   }

}