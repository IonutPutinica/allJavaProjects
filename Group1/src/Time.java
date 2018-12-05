
public class Time
{
   private int hour;
   private int minute;
   
   public Time(int hour, int minute) {
      this.hour = hour;
      this.minute = minute;
   }
   public int getHour() {
      return hour;
   }
   public void setHour(int hour) {
      this.hour = hour;
   }
   public int getMinute() {
      return minute;
   }
   public void setMinute(int minute) {
      this.minute = minute;
   }
   public String toString() {
      String hours = hour + "";
      String minutes = minute + "";
      if(minute < 10) {
         minutes = "0" + minute;
      }
      if(hour < 10) {
         hours = "0" + hour;
      }
      return hours + ":" + minutes;
   }
   public boolean equals(Object obj) {
      if(!(obj instanceof Time)) {
         return false;
      }
      else {
         Time other = (Time) obj;
         return hour == other.hour && minute == other.minute;
      }
   }
}
