package utility.collection;

public class BoundedArrayTQueue
implenets TQueueADT
{
   private int front;
   private int count;
   private T[] queue;

   public BoundedArrayQueue(int capacity)
   {
      queue=new T[capacity];
      front=0;
      count=0;
   }

   public void enqueue(T element) throws IllegalStateException
   {
      queue[count + front] = element;
      count++;
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
   
   

   public int size()
   {
      return count;
   }

}
