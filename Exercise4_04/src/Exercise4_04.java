import java.util.Scanner;
public class Exercise4_04
{
   public static void main(String args[])
   {
      int sum=0,length=0;
      String strings="";
      Scanner input = new Scanner(System.in);
      for(int i=1;i<=6;i++)
      {
         System.out.println("Enter the string variable");
         strings = input.nextLine();
         length = strings.length( );
         sum+=length;
         
         
      }
      
      System.out.println("The total lenght is="+sum);
    
   }
}
