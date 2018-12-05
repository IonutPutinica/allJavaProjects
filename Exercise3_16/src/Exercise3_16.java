import java.util.Scanner;

public class Exercise3_16
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String color;
      System.out.println("Chose your color");
      System.out.println("1.Black");
      System.out.println("2.White");
      System.out.println("3.Red");
      System.out.println("4.Blue");
      color = in.nextLine();
      switch(color)
      {
         default: break;
         case "Black": System.out.println("You must be a Goth!");
         break;
         case "White": System.out.println("You are a very pure person");
         break;
         case "Red" : System.out.println("You are fun and outgoing");
         break;
         case "Blue" : System.out.println("You are not a Chelsea fan, are you?");
         break;
      }
   }
}