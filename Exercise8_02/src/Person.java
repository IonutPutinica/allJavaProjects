public class Person {
   private String name;
   private String birthday;
   
   public Person(String name, String birthday) {
      this.name = name;
      this.birthday = birthday;
   }
   public void setName(String name) {
      this.name = name;
   }
   public void setBir(String birthday)
   {
      this.birthday=birthday;
   }
   public String getName() {
      return this.name;
   }
   public String getBirthday() {
      return this.birthday;
   }

}