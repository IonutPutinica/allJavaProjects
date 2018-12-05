public class TestShape {
   public static void main(String args[]) {
      TwoDimensionalShape[] shapes = new TwoDimensionalShape[3];
      shapes[0] = new Circle(12, 5, 3);
      shapes[1] = new Rectangle(7, 9, 4, 5);
      shapes[2] = new Triangle(3, 4, 5, 6, 7);
      
      for (int i = 0; i < shapes.length; i++) {
         System.out.println(shapes[i].getArea());
      }
   }
}