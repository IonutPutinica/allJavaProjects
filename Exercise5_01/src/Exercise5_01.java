import java.util.Scanner;

public class Exercise5_01
{
   public static void main(String[] args)
   {
      {Scanner cin = new Scanner(System.in);
         int i;
         int[] v = new int[11];
         for (i = 0; i < 10; i++)
         
            v[i] = cin.nextInt();
         for (i = 9; i >=0; i--)
            System.out.print(v[i] + " ");

      }
   }
}