import java.util.Scanner;
import java.util.Random;
public class computer
{
   public static void main(String args[])
   {
      Random random= new Random();
      Scanner read= new Scanner(System.in);
      int nrguesses=1,ok=0,number,upper=1024,lower=1;
      String option;
      System.out.println("Computer guesses a number");
      System.out.println("Think of a number 1-1024");
      number=random.nextInt(upper)+lower;
      while(ok==0)
      {
         System.out.println("The number is "+number);
         System.out.println("Yes/No?");
         option=read.next();
         if(option.equalsIgnoreCase("Yes"))
         {
            System.out.println("The number of computer guesses is "+nrguesses);
            break;
         }
         else
         {
            System.out.println("The number you think is lower or higher?(L/H)");
            option=read.next();
            nrguesses++;
            if(option.equalsIgnoreCase("L"))
            {
               upper=number-1;
               number=random.nextInt(upper-lower+1)+lower;
            }
            else
            {
               lower=number+1;
               number=random.nextInt(upper-lower+1)+lower;
            }
         }
          }
   }
}