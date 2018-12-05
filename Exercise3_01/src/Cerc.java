 import java.util.Scanner;
import static java.lang.Math.*;
public class Cerc
{
  
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in); 
      System.out.print("Enter the radius: ");  
      double radius = in.nextDouble();
      double area = Math.PI * (radius * radius);
      System.out.println("The area of circle is: " + area);
      double circumference= Math.PI * 2*radius;
      System.out.println( "The circumference of the circle is:"+circumference) ;
   }
}