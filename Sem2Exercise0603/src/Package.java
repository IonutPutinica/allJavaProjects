public class Package
{
   public static final String ADD = "ADD";
   public static final String GET = "GET";
   public static final String SIZE = "SIZE";
   public static final String EXIT = "EXIT";
   private String text;
   private Task task;

   public Package(String text, Task task)
   {
      this.text = text;
      this.task = task;
   }

   public Package(String operation)
   {
      this(operation, null);
   }

   public String getText()
   {
      return text;
   }

   public Task getTask()
   {
      return task;
   }

   public String toString()
   {
      if (task == null)
         return "" + text;
      else
         return text + " " + task;
   }
}