import java.util.Scanner;
public class Exercise4_06
{
   public static void main(String args[])
   {
      int number=0,contor=0;
      Scanner input = new Scanner(System.in);
      number=input.nextInt();
      if(number==-1)
         System.out.println(number);
      while(number!=-1)
      {contor++;
      number=input.nextInt();
      if(number==-1)
         System.out.println(contor);
      }


   }
}
