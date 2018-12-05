
public class Bed
{
   private String type;

   public Bed(String type)
   {
      this.type = type;
   }

   public boolean isSingle()
   {
      if (type.equals("single"))

         return true;
      else
         return false;

   }
   public boolean isDouble()
   {
      if (type.equals("double"))

         return true;
      else
         return false;

   }
   public boolean isKingSize()
   {
      if (type.equals("kingsize"))

         return true;
      else
         return false;

   }
}
