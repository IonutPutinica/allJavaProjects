package readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class readfile
{
   public static void main(String[] args) throws FileNotFoundException
   {
      String filename = "7arici.txt";
      File file = new File(filename);
      PrintWriter out = new PrintWriter(file); // Open the file
      String[] text = {"muie" ,"muita", "7note", "7arici" };
      for (int i = 0; i < text.length; i++)
      {
         out.println(text[i]);
         out.flush(); // Force it to write the text
      }
      out.close(); // Close the file
      System.out.println("End writing data to file: " + file.getAbsolutePath());
   }
}
