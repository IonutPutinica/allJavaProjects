
public class ImperailToMetricConverter
{
   private int feet;
   private int inch;
   private int lbs;

   public ImperailToMetricConverter(int feet, int inch, int lbs)
   {
      this.feet = feet;
      this.inch = inch;
      this.lbs = lbs;
   }

   public void setFeet(int feet)
   {
      this.feet = feet;
   }

   public int getFeet()
   {
      return feet;
   }

   public void setInch(int inch)
   {
      this.inch = inch;
   }

   public int getInch()
   {
      return inch;
   }

   public void setLbs(int lbs)
   {
      this.lbs = lbs;
   }

   public int getLbs()
   {
      return lbs;
   }

   public int convertFeetAndInchesIntoCms(int feet, int inch)
   {
      int convertedHeight = (int) (30.48 * feet + 2.54 * inch);
      return convertedHeight;
   }

   public int convertLbsintoKgs(int lbs)
   {
      int convertedWeight = (int) (lbs * 0.453);
      return convertedWeight;
   }
}
