import java.util.Scanner;
public class TreiZeroSapteCuSwitch
{
   public static void main(String[] args)
   {
      int age;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("What is your age?");
      age = keyboard.nextInt();
      
      switch(age)
      {
         default:break;
         case 1: if(age<=0)
         System.out.println("Error in age value");
         break; 
         case 2: if(age<=12);
         System.out.println("You are a child");
         break;
         case 3: if(age<=19);
         System.out.println("You are a teenager");
         break;
         case 4: if(age<=65);
         System.out.println("You are an adult");
         break;
         case 5: if(age>65);
         System.out.println("You are a senior citizen");
         break;
         
            
      }
            
   }

}