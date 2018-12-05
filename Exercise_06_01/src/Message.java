import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message
{

   private String id;
   private String messageBody;
   private LocalDateTime dateTime;

   public Message(String id, String message)
   {

      this.id = id;
      this.messageBody = message;

   }

   public Message(String message)
   {
      this.messageBody = message;
   }

   public Message update()
   {
      this.dateTime = LocalDateTime.now();
      return this;

   }

   public String getId()
   {
      return this.id;
   }

   public void setId(String id)
   {
      this.id = id;
   }

   public String getBody()
   {
      return this.messageBody;
   }

   public LocalDateTime getDateTime()
   {
      return this.getDateTime();
   }

   public String getDateTime(String format)
   {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
      return dateTime.format(formatter);
   }

   public String toString()
   {
      return "ID: " + this.id + "\n Message >" + "\n Sent at: "
            + this.dateTime.getHour() + " / " + this.dateTime.getDayOfYear()
            + " / " + this.dateTime.getMonth();
   }
}