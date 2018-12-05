package utility.collection;

public interface TQueueADT<T>
{
   public void enqueue(T element);

   public T dequeue();

   public T first();

   public int indexOf(T element);

   public boolean isEmpty();

   public boolean isFull();

   public int size();

}
