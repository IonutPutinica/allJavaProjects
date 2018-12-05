import java.util.Scanner;

public class quadraticEquation
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      int a, b , c;
      System.out.print("a=");
      a = input.nextInt();
      System.out.print("b=");
      b = input.nextInt();
      System.out.print("c=");
      c = input.nextInt();
      System.out.println("a="+a + " b="+b + " c="+c);
      double d;
      d = Math.pow(b, 2) - (4 * a * c);
      System.out.println("The determinant is="+d);
      if (d < 0)
         System.out.println("The equation has no solution");
      if (d == 0)
      {
         double x;
         x = (-b / 2 * a);
         System.out.println("The equation has one solution="+x);
      }
      if (d > 0)
      {
         double root1, root2;
         root1 = (-b + Math.sqrt(d) / (2 * a));
         root2 = (-b - Math.sqrt(d) / (2 * a));
         System.out.println("The equation has 2 roots, root 1="+root1+ " and root 2="+root2);
      }

   }
}
