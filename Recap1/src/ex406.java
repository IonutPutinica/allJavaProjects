import java.util.Scanner;

public class ex406
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      int k = 0, a;
      do
      {
         System.out.print("Insert your integer=");
         a = input.nextInt();
         k++;
      }
      while (a != -1);
      k--;
      System.out.println("You have entered " + k + " values");
   }
}
