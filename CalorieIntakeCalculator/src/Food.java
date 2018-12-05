
public class Food
{
   private String name;
   private int caloriesPer100g;

   public Food(String name, int caloriesPer100g)
   {
      this.name = name;
      this.caloriesPer100g = caloriesPer100g;
   }

   public void setName()
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }

   public void setCaloriesPer100g()
   {
      this.caloriesPer100g = caloriesPer100g;
   }

   public int getCaloriesPer100g()
   {
      return caloriesPer100g;
   }
}
