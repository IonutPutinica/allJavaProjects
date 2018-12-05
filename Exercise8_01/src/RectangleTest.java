
public class RectangleTest
{

   public static void main(String[] args)
   {

      Rectangle rectangle1 = new Rectangle(10, 20);
      Rectangle rectangle2 = new Rectangle(50, 50);

      System.out.println("Length of rectangle 1 is: " + rectangle1.getLength());
      System.out.println("Width of rectangle 1 is: " + rectangle1.getWidth());

      System.out.println("Length of rectangle 2 is: " + rectangle2.getLength());
      System.out.println("Width of rectangle 2 is: " + rectangle2.getWidth());

      System.out.println("---------------------------------");

      System.out.println("Changing width of rectangle 1 to 100");
      rectangle1.setWidth(100);
      System.out.println("Changing length of rectangle 2 to 5");
      rectangle2.setLength(5);
      System.out.println("Length of rectangle 1 is: " + rectangle1.getLength());
      System.out.println("Width of rectangle 1 is: " + rectangle1.getWidth());

      System.out.println("Length of rectangle 2 is: " + rectangle2.getLength());
      System.out.println("Width of rectangle 2 is: " + rectangle2.getWidth());
      System.out.println("The area of rectangle 2 is:" + rectangle2.getArea());
      System.out.println("The area of rectangle 1 is:" + rectangle1.getArea());

   }

}