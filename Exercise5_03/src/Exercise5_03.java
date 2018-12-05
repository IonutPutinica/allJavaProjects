import java.util.Scanner;
public class Exercise5_03
{
   public static void main(String[] args)
   {  
      int i,min=6969,sum=0;
      double avg;
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce how many numbers you want to have ");
      int numbers = sc.nextInt();
      int[] v = new int[numbers];
   
      System.out.println("Introduce your numbers");
      
      for( i = 0;i < numbers;i++)
      {
         v[i] = sc.nextInt();
      }
      for(i=0;i<numbers;i++)
      {
         if(v[i]<min)
            min=v[i];
         sum+=v[i];
      }
      avg=(double)sum/numbers;
      System.out.println("The smallest element in the array is="+ min);
      System.out.println("The sum is="+ sum);
      System.out.println("The avg is="+ avg);
     
     
}
}
