package threads.producerconsumer.queues;

public class Hall
{
 private int number;
 public Hall(int number)
 {
 this.number = number;
 }
 public int getNumber()
 {
 return number;
 }
 public String toString()
 {
 return "Hall " + number;
 }
}