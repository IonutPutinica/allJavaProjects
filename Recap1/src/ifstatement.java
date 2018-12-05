
public class ifstatement
{
   public static void main(String args[])
   {
      int a = 5;
      int b = 8;
      if (a == 5)
      {
         System.out.println("bananas");
      }
      if (a == 5 && b == 8)
      {
         System.out.println("No pomegranes");
      }
      if (a % 2 == 0 || b % 2 == 0)
      {
         System.out.println("Arici pogonici");
      }
      if(a>b)
         System.out.println("soarece");
      else
         System.out.println("pisica");
   }
}
