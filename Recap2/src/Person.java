
public class Person
{
   private String name;
   private String birthday;

   public Person(String name, String birthday)
   {
      this.name = name;
      this.birthday = birthday;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }

   public void setBirthday(String birthday)
   {
      this.birthday = birthday;
   }

   public String getBirthday()
   {
      return birthday;
   }

}
