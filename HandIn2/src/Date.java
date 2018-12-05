import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date
{
   private int day;
   private int month;
   private int year;

   public Date(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public Date()
   {
      Calendar calendar = GregorianCalendar.getInstance();
      this.day = calendar.get(Calendar.DAY_OF_MONTH);
      this.month = calendar.get(Calendar.MONTH) + 1;
      this.year = calendar.get(Calendar.YEAR);
   }

   public void set(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public int numberOfDays()
   {
      switch (this.month)
      {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
            return 31;
         case 4:
         case 6:
         case 9:
         case 11:
            return 30;
         case 2:
            if (this.isLeapYear())
               return 29;
            else
               return 28;
         default:
            return -1;

      }
   }

   public boolean isLeapYear()
   {
      if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0)
         return true;
      return false;
   }

   public Date copy()
   {
      return new Date(this.day, this.month, this.year);
   }

   public boolean equals(Object obj)
   {
      if (obj instanceof Date)
      {
         Date other = (Date) obj;
         if (this.day == other.day && this.month == other.month
               && this.year == other.year)
            return true;
      }
      return false;

   }

   @Override
   public String toString()
   {
      return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
   }
}
