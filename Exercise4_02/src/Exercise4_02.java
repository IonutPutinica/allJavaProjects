import java.util.Scanner;

public class Exercise4_02
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   double avg,sum=0;
   for (int i=0; i<5; i++)
   {
   System.out.print("Type an integer: ");
   int value = input.nextInt();
   sum += value;
   }
   System.out.println("The sum is " + sum);
   avg=sum/5;
   System.out.println("The average is " + avg);
   }
  }

