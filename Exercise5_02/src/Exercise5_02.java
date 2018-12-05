import java.util.Scanner;
public class Exercise5_02
{
   public static void main(String[] args)
   {  
      int i,min=6969;
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
      }
      System.out.println("The smallest element in the array is="+ min);
     
     
}
}
