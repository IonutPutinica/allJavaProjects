package matrix;

import java.util.Scanner;

public class matrix
{
   public static void main(String[] args)
   {
      int i, j;
      Scanner sc = new Scanner(System.in);
      System.out.print("Introduce how many rows you want to have= ");
      int rows = sc.nextInt();
      System.out.print("Introduce how many collumns you want to have= ");
      int collumns = sc.nextInt();
      int[][] v = new int[rows][collumns];

      System.out.println("Introduce your numbers");

      for (i = 0; i < rows; i++)
         for (j = 0; j < collumns; j++)
         {
            System.out.print("v[" + i + "]" + "[" + j + "]" + "=");
            v[i][j] = sc.nextInt();
         }
      for (i = 0; i < rows; i++)
      {
         for (j = 0; j < collumns; j++)
         {
            System.out.print(v[i][j] + " ");

         }
      System.out.println();

      }
   }
}
