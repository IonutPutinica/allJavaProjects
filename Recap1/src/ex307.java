import java.util.Scanner;

public class ex307
{
   public static void main(String args[])
   {

      Scanner input = new Scanner(System.in);
      int age;
      System.out.print("Please input your age=");
      age=input.nextInt();
      if(age<0)
         System.out.println("Error in age value");
      if(age>=0 && age<=12)
         System.out.println("You are a child");
      if(age>12 && age<=19)
         System.out.println("You are a teenager");
      if(age>19 && age<=65)
         System.out.println("You are an adult");
      if(age>65)
         System.out.println("You are a senior citizen");



   }
}
