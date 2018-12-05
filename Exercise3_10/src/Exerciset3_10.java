import java.util.Scanner;

public class Exerciset3_10
{

   public static void main(String[] args)
   {
      int a, b, c, val;

      Scanner in = new Scanner(System.in);
      System.out.println("Enter a");
      a = in.nextInt();
      System.out.println("Enter b");
      b = in.nextInt();
      System.out.println("Enter c");
      c = in.nextInt();
      if (a > b)
      {
         val = a;
         a = b;
         b = val;
      }
      if (b < c)
         System.out.println(a + " " + " " + c + " " + b);
      if (c < a)
         System.out.println(c + " " + " " + a + " " + b);

   }
}
