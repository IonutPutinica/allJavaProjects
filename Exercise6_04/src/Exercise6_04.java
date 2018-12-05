import java.util.*;
public class Exercise6_04 {
   public static void main(String args[])
   {
      Scanner read=new Scanner(System.in);
      int array[]=new int[10];
      ArrayList<Integer> count=new ArrayList<Integer>();
      System.out.println("Enter array elements");
      int i,j,x;
      for(i=0;i<10;i++)
         array[i]=read.nextInt();
      for(i=0;i<10;i++)
      {   x=0;
         for(j=0;j<10;j++)
            if(array[i]==array[j])
               x++;
             if(!count.contains(array[i])) 
            count.add(array[i]);  
      }
      System.out.println("ArrayList size is "+count.size());      
   }
}