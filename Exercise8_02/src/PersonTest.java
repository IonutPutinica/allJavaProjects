public class PersonTest {
   public static void main(String[] args) {
      Person person1 = new Person("Bob", "23.07.2017");
      Person person2 = new Person("Andrew", "12.01.2014");
      
      System.out.println(person1.getName());
      System.out.println(person1.getBirthday());
      System.out.println(person2.getName());
      System.out.println(person2.getBirthday());
      System.out.println("-------------------------------");
      person1.setName("Mickey");
      person2.setBir("23.12.1998");
      System.out.println("The 1st person is called "+person1.getName()+" and is born on "+person1.getBirthday());
      System.out.println("The 2nd person is called "+person2.getName()+" and is born on "+person2.getBirthday());

      
   }

}