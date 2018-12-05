
public class Person
{
   private String name;
   // height in cm
   private int height;
   // weight in kg
   private int weight;
   // 0=Female, 1=Male
   private int sex;
   private int age;
   // 1=sedentary, 2=lightly active, 3=moderatly active, 4=very active, 5= extra
   // active
   private int activity;

   public Person(String name, int height, int weight, int sex, int age,
         int activity)
   {
      this.name = name;
      this.height = height;
      this.weight = weight;
      this.sex = sex;
      this.age = age;
      this.activity = activity;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }

   public void setHeight(int height)
   {
      this.height = height;
   }

   public int getHeight()
   {
      return height;
   }

   public void setWeight(int weight)
   {
      this.weight = weight;
   }

   public int getWeight()
   {
      return weight;
   }

   public void setSex(int sex)
   {
      this.sex = sex;
   }

   public int getSex()
   {
      return sex;
   }

   public void setAge(int age)
   {
      this.age = age;
   }

   public int getAge()
   {
      return age;
   }

   public void setActivity(int activity)

   {
      this.activity = activity;
   }

   public int getActivity()
   {
      return activity;
   }
}
