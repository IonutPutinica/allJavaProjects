
public class Point
{
   private int x;
   private int y;

   public Point(int x, int y)
   {
      this.x = x;
      this.y = y;
   }

   public int getX()
   {
      return x;
   }

   public void setX(int x)
   {
      this.x = x;
   }

   public int getY()
   {
      return y;
   }

   public void setY(int y)
   {
      this.y = y;
   }
   
   public void moveTo(int newX, int newY) {
      this.x = newX;
      this.y = newY;
   }
   
   public void move(int xDistance, int yDistance) {
      this.x = x + xDistance;
      this.y = y + yDistance;
   }

   public String toString()
   {
      return "Point " + "(" + x + "," + y + ")";
   }
   
   public boolean equals (Object obj) {
      if (!(obj instanceof Point)) {
         return false;
      }
      Point other = (Point)obj; 
         return this.x == other.x && this.y == other.y;
      
   }
}