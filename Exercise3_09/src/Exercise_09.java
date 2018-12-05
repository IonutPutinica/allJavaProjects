import java.util.Scanner;

public class Exercise_09
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int a, b, c;
      double root1 = 0, root2;
      float d;
      System.out.println("Enter a");
      a = input.nextInt();
      System.out.println("Enter b");
      b = input.nextInt();
      System.out.println("Enter c");
      c = input.nextInt();
      d = b * b - 4 * a * c;
      if (d < 0)
         System.out.println("The eq has no solutions");
      if (d > 0)
         root1 = (-b + Math.sqrt(d) / (2 * a));
      root2 = (-b - Math.sqrt(d) / (2 * a));
      System.out.println("First root is:" + root1);
      System.out.println("Second root is:" + root2);

      if (d == 0)
         root1 = (-b + Math.sqrt(d)) / (2 * a);
      System.out.println("Root:" + root1);

   }

}
