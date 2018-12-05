import java.util.ArrayList;

public class TaskList
{
   private ArrayList<Task> tasks;

   public TaskList()
   {
      tasks = new ArrayList<Task>();
   }

   public synchronized void add(Task task)
   {
      tasks.add(task);
   }

   public synchronized Task getAndRemoveNextTask()
   {
      Task task = null;
      if (tasks.size() > 0)
      {
         task = tasks.get(0);
         tasks.remove(0);
      }
      return task;
   }

   public synchronized int size()
   {
      return tasks.size();
   }

   public String toString()
   {
      return "Tasks=" + tasks;
   }
}