import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Log {

   private File file;

   private QueueADT<LogLine> logs;

   GregorianCalendar calendar;

   public Log() {
      logs = new ArrayQueue<LogLine>();
      int curDate = calendar.DAY_OF_YEAR;
      int curMonth = calendar.MONTH;
      int curYear = calendar.YEAR;

      file = new File("src/logInfo" + curDate + "/" + curMonth + "/" + curYear + ".txt");

   }

   public void add(LogLine logLine) {

      if (logLine == null) {
         return;
      }
      BufferedWriter out = null;
      try {
         out = new BufferedWriter(new FileWriter(file, true));
         out.write(logLine + "\n");
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            out.close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }

   public QueueADT<LogLine> getAll() {
      return logs;
   }
}

