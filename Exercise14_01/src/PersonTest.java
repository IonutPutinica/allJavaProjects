public class PersonTest {

   public static void main(String[] args)
   {
      MyDate janiceBirthday=new MyDate(29,10,1998);
      
      Person janice = new Person(janiceBirthday);
      
      janiceBirthday.set(10, 10, 1990);
      
       MyDate test=janice.getBirthday();     
       
       test.set(5, 5, 5);
       System.out.println(janice.getName());
      System.out.println(janice.getBirthday());
      
      
      
   }
}