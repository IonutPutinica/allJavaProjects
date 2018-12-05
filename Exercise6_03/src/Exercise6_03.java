import java.util.*;
public class Exercise6_03 {
    public static void main(String args[])
    {
      Scanner read=new Scanner(System.in);
      ArrayList<Integer>positive=new ArrayList<Integer>();
      ArrayList<Integer>negative=new ArrayList<Integer>();
      int value,largest=0,smallest=0,i;
      System.out.println("Enter values");
      do
      {
         value=read.nextInt();
         if(value!=0)
         {
            if(value>0)
               positive.add(value);
            else
               negative.add(value);
         }
      }while(value!=0);
      for(i=0;i<positive.size();i++)
         if(largest<positive.get(i))
            largest=positive.get(i);
      for(i=0;i<negative.size();i++)
         if(negative.get(i)<smallest)
            smallest=negative.get(i);
      System.out.println("There are "+positive.size()+" positive numbers.");
      System.out.println("There are "+negative.size()+" negative numbers.");
      System.out.println("The largest element is "+largest);
      System.out.println("The smallest element is "+smallest);
    }
}