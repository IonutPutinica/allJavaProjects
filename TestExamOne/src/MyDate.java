import java.util.GregorianCalendar;

public class MyDate
{
   private int day;
   private int month;
   private int year;

   public MyDate(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public int getDay()
   {
      return this.day;
   }

   public int getMonth()
   {
      return this.month;
   }

   public int getYear()
   {
      return this.year;
   }

   public void set(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public MyDate copy()
   {
      MyDate date = new MyDate(day, month, year);
      return date;
   }

   public MyDate now()
   {
      int day, month, year;
      GregorianCalendar calendar = new GregorianCalendar();
      day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
      month = calendar.get(GregorianCalendar.MONTH);
      year = calendar.get(GregorianCalendar.YEAR);
      MyDate date = new MyDate(day, month, year);
      return date;

   }
}
