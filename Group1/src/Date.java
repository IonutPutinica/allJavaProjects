
public class Date
{
   private int day;
   private int month;
   private int year;
   
   public Date(int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;
   }
   public int getDay() {
      return day;
   }
   public void setDay(int day) {
      this.day = day;
   }
   public int getMonth() {
      return month;
   }
   public void setMonth(int month) {
      this.month = month;
   }
   public int getYear() {
      return year;
   }
   public void setYear(int year) {
      this.year = year;
   }
   public String toString() {
      String days = day + "";
      String months = month + "";
      if(day < 10) {
         days = "0" + day;
      }
      if(month < 10) {
         months = "0" + month;
      }
      return days + "/" + months + "/" + year;
   }
   public boolean equals(Object obj) {
      if(!(obj instanceof Date)) {
         return false;
      }
      else {
         Date other = (Date) obj;
         return day == other.day && month == other.month && year == other.year;
      }
   }
}
