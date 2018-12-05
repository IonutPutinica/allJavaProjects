
public class LogLine
{
   private String text;

   private DateTime dates;

   public LogLine(String text)
   {
      this.text = text;
   }

   public String getLogText()
   {
      return text;
   }

   public DateTime getDateTime()
   {
      return new DateTime();
   }

   public String getTimestamp()
   {
      return dates.getTimestamp();
   }

   public String toString()
   {
      return dates.getTimestamp() + " " + this.text;
   }
}
