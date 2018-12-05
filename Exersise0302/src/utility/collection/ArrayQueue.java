package utility.collection;

public class ArrayQueue<T> implements QueueADT<T>
{
   private static final int DEFAULT_CAPACITY = 100;
   private int front;
   private int count;
   private T[] queue;

   public ArrayQueue(int initialCapacity)
   {
      this.front = 0;
      this.count = 0;
      this.queue = (T[]) new Object[initialCapacity];
   }

   public ArrayQueue()
   {
      for (int i = 0; i < queue.length; i++)
         if (queue.length == i)
         {
            this.front = i;
         }
   }

   public String toString()
   {
      return "The front is=" + front + " the count is=" + count
            + "the total is=" + front;
   }

   @Override
   public void enqueue(T element)
   {
      try
      {
         queue[count] = element;
         count++;

      }
      catch (ArrayIndexOutOfBoundsException e)
      {
         throw new IllegalStateException("Queue is full!!!!!!");
      }

   }

   @Override
   public T dequeue()
   {
      if (queue[front] != null)
      {
         T dequeued = queue[front];
         queue[front] = null;
         front++;
         return dequeued;
      }
      else
      {
         throw new IllegalStateException("The queue is empty!!!!");
      }
   }

   @Override
   public T first()
   {
      if (queue[front] != null)
         return queue[front];
      else
      {
         throw new IllegalStateException("The queue is empty!!!!");
      }

   }

   @Override
   public int indexOf(T element)
   {
      for (int i = front; i < count; i++)
         if (queue[i].equals(element))
            return i - front;
         else
         {
            throw new IllegalStateException("The element is not in the queue");
         }
      return -1;

   }

   @Override
   public boolean isEmpty()
   {
      if (queue[front] == null)
         return true;
      else
         return false;
   }

   @Override
   public int size()
   {
      return count;
   }

   private void expandCapacity()
   {
      this.count++;
   }
}
