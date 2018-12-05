public class MyDate {
   private int day;
   private int month;
   private int year;
   private int days;
   private String months;

   public MyDate(int day, int month, int year) {
      set(day, month, year);
   }

   public void setDay(int day) {
      this.day = day;
   }

   public void setMonth(int month) {
      this.month = month;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public int getDay() {
      return day;
   }

   public int getMonth() {
      return month;
   }

   public int getYear() {
      return year;
   }

   public void set(int day, int month, int year) {

      this.day = day;
      this.month = month;
      this.year = year;

      if (this.year < 0) {
         this.year = -this.year;
      }

      if (this.month < 1) {
         this.month = 1;
         year--;

      } else if (this.month > 12) {
         this.month = 12;
         year++;
      }

      if (this.day < 1) {
         this.day = 1;
      }
      if (this.day > numbersOfDaysInMonth()) {
         this.day = numbersOfDaysInMonth();
      }
   }

   public boolean isLeapYear() {
      return (this.year % 4 == 0 && (this.year % 100 != 0 || year % 400 == 0));

   }

   public String toString() {
      String all = "";
      if (day < 10) {
         all += "0";
      }
      all += day + "/";
      if (month < 10) {
         all += "0";
      }
      all += month + "/" + year;

      return all;
   }

   public int numbersOfDaysInMonth() {
      switch (month) {
      case 1:
         return 31;
      case 2:
         return 28;
      case 3:
         return 31;

      case 4:
         return 30;

      case 5:
         return 31;

      case 6:
         return 30;

      case 7:
         return 31;

      case 8:
         return 31;

      case 9:
         return 30;

      case 10:
         return 31;

      case 11:
         return 30;

      case 12:
         return 31;

      }
      if (isLeapYear() && month == 2) {
         days = 29;
      }
      return days;
   }

   public String getMonthName() {
      switch (month) {
      case 1:
         return "January";
      case 2:
         return "February";
      case 3:
         return "March";

      case 4:
         return "April";

      case 5:
         return "May";

      case 6:
         return "June";

      case 7:
         return "July";

      case 8:
         return "August";

      case 9:
         return "September";

      case 10:
         return "October";

      case 11:
         return "November";

      case 12:
         return "December";
      default:
         return "Illegal month";
      }
   }

   public void stepForwardOneDay() {
      day++;
      if (day > numbersOfDaysInMonth()) {
         day = 1;
         month++;
         if (month > 12) {
            month = 1;
            year++;
         }
      }
   }

   public void stepForward(int days) {
      for (int i = 0; i < days; i++) {
         stepForwardOneDay();
      }
   }
   
   public boolean equals (Object obj) {
      if(!(obj instanceof MyDate)) {
         return false;
      }
      MyDate other = (MyDate)obj;
      return this.day == other.day && this.month == other.month 
            && this.year == other.year;
   }
   public MyDate copy() {
      MyDate copy = new MyDate(day, month, year);
      return copy;
   }

}