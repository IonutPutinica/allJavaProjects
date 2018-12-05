package sumnnumbers;
import java.util.Scanner;

public class sumnnumbers
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int s=0, i, n;
      System.out.println("n=");
      n = input.nextInt();
      for(i=0;i<=n;i++)
      {
         s+=i;
      }
      System.out.println("Sum is="+s);
   }
   
}
