import java.util.Scanner;

public class question_3
{
   public static void main(String[] args)
   {
      int n,i;
      
      Scanner input=new Scanner(System.in);
      System.out.print("Input the number of elements of the array=");
      n=input.nextInt();
      int []v=new int[n];
      for(i=0;i<n;i++)
      {
         System.out.print("v["+i+"]=");
         v[i]=input.nextInt();
      }
      
   }
   }
}
