import java.util.Scanner;

public class Main
{
   public static void main(String args[])
   {
      int metricOrImperial, sex, age, activity, option, stopCalculator = 0;
      String name;
      Person pers = new Person(null, 0, 0, 0, 0, 0);
      CalorieCalculator calc = new CalorieCalculator(pers);
      ImperailToMetricConverter conv = new ImperailToMetricConverter(0, 0, 0);
      WeightChange weightCh = new WeightChange(calc);
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to the calorie calculator");
      System.out.print("Please insert your name first=");
      name = input.next();
      pers.setName(name);
      System.out.println("Hi " + name
            + "! Welcome to the Calorie Intake Calculator. To start, you must input your height, weight, sex and activity level");
      System.out.println(
            "-- Please choose between the metric system and the imperial system--");
      System.out
            .print("Press 0 for metric system, or 1 for the imperial system=");
      metricOrImperial = input.nextInt();
      switch (metricOrImperial)
      {
         case 0:
            System.out.println("You have picked the metric system!");
            int cms, kgs;
            System.out.print("Input your height in cms=");
            cms = input.nextInt();
            pers.setHeight(cms);
            System.out.print("Input your weight in kgs=");
            kgs = input.nextInt();
            pers.setWeight(kgs);
            break;

         case 1:
            System.out.println("You have picked the imperial system");
            int feet, inch, lbs;
            System.out.println("Input your height in feet and inches");
            System.out.print("Please input the feet=");
            feet = input.nextInt();
            System.out.print("Please input the inches now=");
            inch = input.nextInt();
            pers.setHeight(conv.convertFeetAndInchesIntoCms(feet, inch));
            System.out.print("Input your weight in lbs=");
            lbs = input.nextInt();
            pers.setWeight(conv.convertLbsintoKgs(lbs));
            break;

      }
      System.out.print("Please input your sex 0=M/1=F =");
      sex = input.nextInt();
      pers.setSex(sex);
      System.out.print("Please input your age=");
      age = input.nextInt();
      pers.setAge(age);
      // 1=sedentary, 2=lightly active, 3=moderatly active, 4=very active,
      // 5=extra active
      System.out.print(
            "Please input your activity level, where 1=sedentary, 2=lightly active, 3=moderatly active, 4=very active, 5=extra active =");
      activity = input.nextInt();
      pers.setActivity(activity);
      System.out.println("Calorie intake calculator initiated");
      while (stopCalculator == 0)
      {
         System.out.println("~~Please pick one of the following options~~");
         System.out.println("1.Stop the calculator");
         System.out.println("2.Display your basic metabolic rate");
         System.out.println(
               "3.Display the calorie level for maintaining your weight");
         System.out.println(
               "4.Display the amount of calories to lose 2kgs in 4 weeks (apprrox 4.5lbs)");
         System.out.println(
               "5.Display the amount of calories to lose 4kgs in 4 weeks (approx 9lbs)");
         System.out.println(
               "6.Display the amount of calories to gain 2 kgs in 4 weeks(approx 4.5lbs)");
         System.out.println(
               "7.Display the amount of calories to gain 4kgs in 4 weeks(approx 9lbs)");
         System.out.print("Please input your option=");
         option = input.nextInt();
         switch (option)
         {
            case 1:
               stopCalculator = 1;
               System.out.println("Calorie intake calculator stopped!");
               break;
            case 2:
               System.out.println("Your basic metabolic rate is= "
                     + calc.calculateBasicMetabolicRate() + " calories");
               break;
            case 3:
               System.out
                     .println("To maintain your weight, you need to eat daily="
                           + calc.calculateLevelOfCaloriesForWeightMaintain()
                           + " calories");
               break;
            case 4:
               System.out.println(
                     "To lose 2kgs(4.5lbs) in 4 weeks, you need to consume daily "
                           + weightCh.lose2KgsIn4Weeks() + " calories");
               break;
            case 5:
               System.out.println(
                     "To lose 4kgs(9lbs) in 4 weeks, you need to consume daily "
                           + weightCh.lose4KgsIn4Weeks() + " calories");
               break;
            case 6:
               System.out.println(
                     "To gain 2kgs(4.5lbs) in 4 weeks, you need to consume daily "
                           + weightCh.gain2KgsIn4Weeks() + " calories");
               break;
            case 7:
               System.out.println(
                     "To gain 4kgs(9lbs) in 4 weeks, you need to consume daily "
                           + weightCh.gain4KgsIn4Weeks() + " calories");
               break;

         }
      }

   }
}
