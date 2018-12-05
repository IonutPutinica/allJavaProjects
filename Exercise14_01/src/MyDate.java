public class MyDate
{
   private int month;
   private int day;
   private int year;
   
   public MyDate(int d, int m, int y)
   {
      day = d;
      month = m;
      year = y;
   }
   
   public MyDate()
   {
     day = 1;
     month = 1;
     year = 1970;
   }
   
   public int getMonth()
   {
      return month;
   }
   
   public int getDay()
   {
      return day;
   }
   
   public int getYear()
   {
      return year;
      
   }
  
      
   public boolean isLeapYear()
   {
      
      if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
      {
         return true;
      
      }
      
      else
      {
         return false;
      }
       
   }

   
   public void set(int day, int month, int year)
   {
      this.month = month;
      this.day = day;
      this.year = year;
   }
   
   public void set(int day, String monthName, int year)
   {
      this.day=day;
      this.year=year;
   }
   
   
   public int numberOfDaysInMonth()
   {  
      int d=0;
      
      if((month%2!=0 && month<7) || (month%2==0 && month>7) && !isLeapYear() && month!=2) d=30;
      
      else
         if((month%2==0 && month<7) || (month%2!=0 && month>7) && !isLeapYear() && month!=2) d=31;
      
      if(month==2 && isLeapYear()) d=29;
      
      if(month==2 && !isLeapYear()) d=28;
      
      return d;
   }
   
   @Override
   public String toString() {
      return "MyDate [month=" + month + ", day=" + day + ", year=" + year + "]";
   }
   
   public MyDate copy()
   {
      MyDate copyDate = new MyDate(this.day, this.month, this.year);
      
      return copyDate;
   }
}