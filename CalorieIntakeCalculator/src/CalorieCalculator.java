
public class CalorieCalculator
{
   private Person person;

   public CalorieCalculator(Person person)
   {
      this.person = person;
   }

   public double calculateBasicMetabolicRate()
   {
      double basicMetabolicRate;
      if (person.getSex() == 0)
      {
         basicMetabolicRate = 10 * person.getWeight()
               + (6.25 * person.getHeight()) - 5 * person.getAge() + 5;
      }
      else
         basicMetabolicRate = 10 * person.getWeight()
               + (6.25 * person.getHeight()) - 5 * person.getAge() - 161;
      return basicMetabolicRate;
   }

   public double calculateLevelOfCaloriesForWeightMaintain()
   {
      double levelOfCaloriesForWeightMaintain = 0;
      if (person.getActivity() == 1)
      {
         levelOfCaloriesForWeightMaintain = calculateBasicMetabolicRate()
               * 1.21;
      }
      if (person.getActivity() == 2)
      {
         levelOfCaloriesForWeightMaintain = calculateBasicMetabolicRate()
               * 1.38;
      }
      if (person.getActivity() == 3)
      {
         levelOfCaloriesForWeightMaintain = calculateBasicMetabolicRate()
               * 1.56;
      }
      if (person.getActivity() == 4)
      {
         levelOfCaloriesForWeightMaintain = calculateBasicMetabolicRate()
               * 1.73;
      }
      if (person.getActivity() == 5)
      {
         levelOfCaloriesForWeightMaintain = calculateBasicMetabolicRate()
               * 1.91;
      }
      return levelOfCaloriesForWeightMaintain;
   }
}
