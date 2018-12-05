package threads.producerconsumer.queues;

import utils.collection.ArrayQueue;
import utils.collection.QueueADT;

public class WashingHall
{
   private QueueADT<Hall> availableHalls;
   private int occupiedHalls;
   private boolean qChanged;

   public WashingHall(int numberOfWashingHalls)
   {
      this.availableHalls = new ArrayQueue<>(numberOfWashingHalls);
      qChanged = false;
      for (int i = 0; i < numberOfWashingHalls; i++)
      {
         this.availableHalls.enqueue(new Hall(i));
      }
   }

   /*
    * Customer enters for washing the car. A customer waits if all washing
    * places are occupied
    */
   public synchronized Hall enterForWashing()
   {
      while (availableHalls.isEmpty())
      {
         try
         {
            wait();
         }
         catch (InterruptedException ie)
         {
            // TODO: handle exception
         }
      }
      Hall hall = availableHalls.dequeue();
      qChanged = true;
      occupiedHalls++;

      notifyAll();
      return hall;

   }

   /*
    * Car washing has finished and customer leaves the washing place so that the
    * next waiting car can enter.
    */
   public synchronized void leaveWashing(Hall hall)
   {

      while (availableHalls.isFull())
      {
         try
         {
            wait();
         }
         catch (InterruptedException ie)
         {
            // TODO: handle exception
         }
      }
      availableHalls.enqueue(hall);
      qChanged = false;
      occupiedHalls--;

      notifyAll();

   }

   public synchronized int getFreePlaces()
   {
      while (!qChanged)
      {
         try
         {
            wait();
         }
         catch (InterruptedException ie)
         {
            // TODO: handle exception
         }
      }
      qChanged = false;
      int freePlaces = availableHalls.size();
      notifyAll();
      return freePlaces;

   }
}