import java.util.Scanner;

public class digits
{
   public static void main(String[] args)
   {
      int n, i, k = 0, nrcif, aux = 0;

      Scanner input = new Scanner(System.in);
      // Reading from the keyboared the number of elements from the array
      System.out.print("Insert the amount of numbers you want to test out=");
      n = input.nextInt();
      int[] v = new int[n];
      // Reading the elements of the array
      System.out.println("Introduce the elements of the array");
      for (i = 0; i < n; i++)
      {
         System.out.print("v[" + i + "]=");
         v[i] = input.nextInt();
      }
      System.out.print("The even numbers with 2 digits from the array are=");
      for (i = 0; i < n; i++)
      {
         nrcif = 0;
         aux = v[i];
         // Calculating the number of digits
         while (v[i] != 0)
         {
            nrcif++;
            v[i] = v[i] / 10;
         }
         if (nrcif == 2 && aux % 2 == 0)
         {
            System.out.print(aux + " ");
            k++;
         }

      }
      System.out.println();
      System.out.println(
            "The number of even numbers with 2 digits from the array is=" + k);
   }
}
