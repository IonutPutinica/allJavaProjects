import java.util.Scanner;
public class Exercise4_03
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   
   int number;
   System.out.print("Type an integer: ");
    number = input.nextInt();
    while(number<=10 || number>=25)
    {
       System.out.println("Invalid number, write a new one!");
       number = input.nextInt();
    }
   System.out.println("The number is "+ number);
   }

}