import java.util.Scanner;

public class ex506
{
   public static void main(String args[])
   {

      Scanner input = new Scanner(System.in);
      int n, i;
      System.out.println(
            "Please insert the number of integers you want in your array=");
      n = input.nextInt();
      int[] v = new int[n];
      for (i = 0; i < n; i++)
      {
         System.out.print("v[" + i + "]=");
         v[i] = input.nextInt();
      }
      int min = 666;
      for (i = 0; i < n; i++)
      {
         if (v[i] < min)
            min = v[i];
      }
      int min2 = 667;
      for (i = 0; i < n; i++)
      {
         if (v[i] < min2 && v[i] != min)
            v[i] = min2;
      }
      System.out.println("The 2nd smallest element in the array is=" + min2);
   }
}