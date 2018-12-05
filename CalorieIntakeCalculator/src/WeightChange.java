
public class WeightChange
{
   private CalorieCalculator cc;

   public WeightChange(CalorieCalculator cc)
   {
      this.cc = cc;
   }

   public double lose2KgsIn4Weeks()
   {
      double levelOfCalories;
      levelOfCalories = cc.calculateLevelOfCaloriesForWeightMaintain() - 500;
      return levelOfCalories;
   }

   public double lose4KgsIn4Weeks()
   {
      double levelOfCalories;
      levelOfCalories = cc.calculateLevelOfCaloriesForWeightMaintain() - 1000;
      return levelOfCalories;
   }

   public double gain2KgsIn4Weeks()
   {
      double levelOfCalories;
      levelOfCalories = cc.calculateLevelOfCaloriesForWeightMaintain() + 500;
      return levelOfCalories;
   }

   public double gain4KgsIn4Weeks()
   {
      double levelOfCalories;
      levelOfCalories = cc.calculateLevelOfCaloriesForWeightMaintain() + 1000;
      return levelOfCalories;
   }
}
