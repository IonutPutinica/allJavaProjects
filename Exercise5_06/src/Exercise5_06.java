import java.util.Scanner;
public class Exercise5_06
{
   public static void main(String[] args)
   {  
      int i,max=0,max2=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce how many numbers you want to have ");
      int numbers = sc.nextInt();
      int[] v = new int[numbers];
   
      System.out.println("Introduce your numbers");
      
      for( i = 0;i < numbers;i++)
      {
         v[i] = sc.nextInt();
      }
     
      for( i = 0;i < numbers;i++)
      {
         if(v[i]>max)
            max=v[i];
      }
      for( i = 0;i < numbers;i++)
      {
         if(v[i]>max2 && v[i]!=max)
            max2=v[i];
      }
      System.out.println("The 2nd largest element is="+max2);

}
}
