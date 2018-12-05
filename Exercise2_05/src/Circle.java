
import java.util.Scanner;
public class Circle
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Enter the radius: ");
      
      double radius = 22.5;
      //Area = PI*radius*radius
      double area = Math.PI * (radius * radius);
      System.out.println("The area of circle is: " + area);
      //Circumference = 2*PI*radius
      double circumference= Math.PI * 2*radius;
      System.out.println( "The circumference of the circle is: "+circumference) ;
   }
}