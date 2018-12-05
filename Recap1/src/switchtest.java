import java.util.*;

public class switchtest
{
   public static void main(String args[])
   {
      int option;
      System.out.print("Please insert your option=");
      Scanner input = new Scanner(System.in);
      option = input.nextInt();
      switch (option)
      {
         default:
            break;
         case 0:
            System.out.println("Arici pogonici");
            break;
         case 1:
            System.out.println("Coro sobolanora");
            break;
         case 2:
            System.out.println("Sobolan grasan");
            break;
      }
   }
}
