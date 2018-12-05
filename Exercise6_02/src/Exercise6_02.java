import java.util.*;
import java.awt.*;
public class Exercise6_02 {
   public static void main(String args[])
   {
      Scanner read=new Scanner(System.in);
      ArrayList<String> words=new ArrayList<String>();
      int n,i;
      String x;
      System.out.println("Enter strings");
      x=read.nextLine();
      if(!x.isEmpty()) {
     do{
         words.add(x);
         x=read.nextLine();
      }while(!x.isEmpty());
      }
      n=words.size();
      String array[]=new String[n];
      for(i=0;i<n;i++)
         array[i]=words.get(i);
      System.out.println("Show array");
      for(i=0;i<n;i++)
         System.out.println(array[i]);
   }
}