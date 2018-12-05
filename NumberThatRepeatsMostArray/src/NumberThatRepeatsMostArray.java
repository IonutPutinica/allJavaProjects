import java.util.Scanner;

public class NumberThatRepeatsMostArray
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Input the number of elemets of the array=");
      int m, n, i, j = 0, aux, x, k = 0, max = 0;
      n = input.nextInt();
      m = n;
      int[] v = new int[n];
      int[] a = new int[m];
      for (i = 0; i < n; i++)
      {
         System.out.print("v[" + i + "]=");
         v[i] = input.nextInt();
      }

      for (i = 0; i < n; i++)
      {
         k = 0;
         aux = v[i];
         for (x = 0; x < n; x++)
         {
            if (aux == v[i])
               k++;
            a[j] = k;
         }
         j++;
      }

      for (j = 0; j < m; j++)
      {
         if (a[j] > max)
         {
            max = a[j];
         }
      }

      System.out.println(max);
   }

}
