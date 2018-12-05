
public class PointTest
{
   public static void main(String[] args) {
      Point point = new Point(34,4);
      Point point1 = new Point (3,4);
      
      System.out.println(point.toString());
      System.out.println(point.equals(point1));
      
      point.move(23, 12);
      System.out.println(point);
      
      point.moveTo(69, 18);
      System.out.println(point);
   }
}
