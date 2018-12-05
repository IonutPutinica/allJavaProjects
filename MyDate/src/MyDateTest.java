public class MyDateTest {

   public static void main(String[] args) {
      MyDate date = new MyDate(22, 9, 2017);
      MyDate date2 = new MyDate(-22, 32, -2017);
      System.out.println(date.isLeapYear());
      System.out.println(date.numbersOfDaysInMonth());
      System.out.println(date.toString());
      System.out.println(date.getMonthName());
      
      date.stepForward(5);
      System.out.println(date);
   
      
      date = new MyDate(22, 9, 2017);
      date2 = new MyDate(24, 2, 1582);
      int leapYears = 0;
      
      for (int i = 1582; i <=2017; i++) {
         date2.set(1, 1, i);
         if (date2.isLeapYear()) {
            leapYears++;
         }
      }
      System.out.println("Number of leap years since 1582: " + leapYears);
   }

}