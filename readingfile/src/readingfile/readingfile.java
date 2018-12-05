package readingfile;

import java.io.File;
import java.io.PrintWriter;

public class readingfile
{
   String filename = "test.txt";
   File file = new File(filename);
   PrintWriter out = new PrintWriter(file); // Open the file

   String[] y = {"h"};
   for (int i = 0; i < text.length; i++)
   {
   out.println(text[i]);
   out.flush(); // Force it to write the text
   }
   out.close(); // Close the file
   System.out.println("End writing data to file: " + file.getAbsolutePath());
}
}