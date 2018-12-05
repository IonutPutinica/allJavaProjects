package utility.collection;

public class BoundedArrayTQueue<T> implements TQueueADT<T>

{
   private int front;
   private int count;
   private T[] queue;

   public BoundedArrayTQueue(int capacity)
   {

      this.count = 0;
      this.front = 0;
      T[] queue = (T[]) new Object[capacity];
   }

   public void enqueue(T element) throws IllegalStateException
   {
      try
      {
         queue[count] = element;
         count++;

      }
      catch (ArrayIndexOutOfBoundsException e)
      {
         throw new IllegalStateException("Queue is full");
      }
   }

   public T dequeue()
   {
      T element = queue[front];
      queue[front] = null;
      front++;
      count--;
      return element;
   }

   public T first() throws IllegalStateException
   {
      return queue[front];
   }

   public int indexOf(T element)
   {
      int index = 0;
      for (int i = front; i < count + front; i++)
      {
         if (queue[i].equals(element))
         {
            index = i - front + 1;
            return index;
         }
      }
      return -1;
   }

   public boolean isEmpty()
   {
      if (count == 0)
         return true;
      else
         return false;
   }

   public boolean isFull()
   {
      if (this.count == queue.length)
         return true;
      else
         return false;
   }

   public int size()
   {
      return count;
   }

   public String toString()
   {
      String string = "{";
      for (int i = front; i < count + front - 1; i++)
      {
         string = string + queue[i] + ", ";
      }
      string = string + queue[count + front - 1] + "}";
      return string;
   }
}
