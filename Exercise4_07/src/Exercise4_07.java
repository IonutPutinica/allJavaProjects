import java.util.Scanner;
public class Exercise4_07
{
   public static void main(String args[])
   {
      int number,i;
      Scanner input = new Scanner(System.in);
      System.out.println("Number=");
      number=input.nextInt();
      for(i=1;i<=number;i++)
      {
         System.out.print(i + " ");
        
      }
      System.out.println();
      for(i=1;i<=number;i++)
      { 
         System.out.print(2*i + " ");
      }
      
      System.out.println();
      for(i=1;i<=number;i++)
      { 
         System.out.print(i*i + " ");
      }


   }
}
