import java.util.Scanner;

public class Exercise3_12
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int option;
      System.out.println("Enter your option");
      option = in.nextInt();
      switch(option)
      {
         default: break;
         case 12: System.out.println("A");
         break;
         case 10: System.out.println("B");
         break;
         case 7: System.out.println("C");
         break;
         case 4: System.out.println("D");
         break;
         case 2: System.out.println("E");
         break;
         case 0: System.out.println("Fx");
         break;
         case -3: System.out.println("F");
         break;
      }
   }
}
