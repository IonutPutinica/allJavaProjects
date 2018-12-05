import java.util.Scanner;

public class ex306
{
   public static void main(String args[])
   {
      int integer1, integer2;
      Scanner input = new Scanner(System.in);
      System.out.print("Insert the first integer=");
      integer1 = input.nextInt();
      System.out.print("Insert the second integer=");
      integer2 = input.nextInt();
      if (integer1 < integer2)
         System.out.println(integer1 + " " + integer2);
      else
         System.out.println(integer2 + " " + integer1);
      int sum;
      sum = integer1 + integer2;
      System.out.println("The sum of the 2 integers=" + sum);

      if (integer2 == 0)
         System.out.println("Cannot divide by 0");
      else
      {
         double quotient;
         quotient = integer1 / integer2;
         System.out.println("quotient="+quotient);
      }

      if (integer2 == 0)
         System.out.println("Cannot divide by 0");
      else
      {
         double modulus;
         modulus = integer1 % integer2;
         System.out.println("modulus="+modulus);
      }

   }
}
