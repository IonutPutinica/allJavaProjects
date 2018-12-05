
public class Colour
{
   private int red;
   private int green;
   private int blue;

   public Colour(int red, int green, int blue)
   {
      this.red = red;
      this.green = green;
      this.blue = blue;
   }

   public void set(int red, int green, int blue)
   {
      this.red = red;
      this.blue = blue;
      this.green = green;
   }

   public int getRed()
   {
      return red;
   }

   public int getGreen()
   {
      return green;
   }

   public int getBlue()
   {
      return blue;
   }

   public boolean isGray()
   {
      if (red == green && red == blue && blue == green)
      {
         return true;
      }
      return false;
   }

   public void mixWith(Colour colour2)
   {
      this.red = (int) (this.red * 0.5 + colour2.red * 0.5);
      this.green = (int) (this.green * 0.5 + colour2.green * 0.5);
      this.blue = (int) (this.blue * 0.5 + colour2.blue * 0.5);
   }

   public Colour copy()
   {
      Colour copy = new Colour(red, green, blue);
      return copy;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Colour))
      {
         return false;
      }
      Colour other = (Colour) obj;
      return red == other.red && blue == other.blue && green == other.green;
   }

   @Override
   public String toString()
   {
      return "Colour [red=" + red + ", green=" + green + ", blue=" + blue + "]";
   }

}
