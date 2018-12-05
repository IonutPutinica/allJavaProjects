
public class Triangle extends TwoDimensionalShape
{
   private double sideA;
   private double sideB;
   private double sideC;

   public Triangle(double x, double y, double sideA, double sideB, double sideC)
   {
      super(x, y);
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
   }

   public void getSides(double sideA, double sideB, double sideC)
   {
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
   }

   public double getArea()
   {
      return 0.5 * sideA * sideB
            * Math.sin(Math.acos((sideA * sideA + sideB * sideB - sideC * sideC)
                  / (2 * sideA * sideB)));
   }
}
