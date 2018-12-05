public class Person {
   
   private String fullName;
   
   private MyDate birthday;

   public Person(MyDate birthday)
   {
      this.birthday = birthday.copy();
   }
   
   public String getName()
   {
      return fullName;
   }
   
   
   public MyDate getBirthday()
   {
      return birthday.copy();
   }
   
   public void setName(String name)
   {
      fullName = name;
   }
   
   public int getAge()
   {
      return 2017-birthday.getYear();
   }
   
   
}
