
public class Note
{
   private String message;
   private boolean highPriority;

   public Note(String message)
   {
      this.message = message;
      highPriority = false;
   }

   public String getMessage()
   {
      return message;
   }

   public void setMessage(String message)
   {
      this.message = message;
   }

   public boolean isHighPriority()
   {
      return highPriority;
   }

   public void setToHighPriority()
   {
highPriority=true;
   }
   public void setToLowPriority()
   {
      highPriority=false;
   }
   public Note copy;
   {
      Note copyNote= new Note(message);
      if(highPriority)
      {
         copyNote.setToHighPriority();
      }
      else {
         copyNote.setToLowPriority();
   }
   
   }
   return copyNote;

public String toString()
{
   return "Note with message:" + message + "has high priority"+ highPriority;
}
