import java.util.Scanner;
public class eq
{
   public static void main(String[] args)
   {
      int a, b, c;
      float D;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("What is the value of a? ");
      a = keyboard.nextInt();
      
      System.out.println("What is the value of b? ");
      b = keyboard.nextInt();
      
      System.out.println("What is the value of c? ");
      c = keyboard.nextInt();
      
      D = (float) (Math.pow(b, 2) - 4 * a * c);
      
    
      System.out.println("D is " + D);
      
      if(D<0);
      System.out.println("The equation has no solutions" );
      
      if(D=0)
      System.out.println("The equation has one solution: " + x);
      
      
   }

}