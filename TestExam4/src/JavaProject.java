import java.util.ArrayList;

public class JavaProject
{
   private String name;
   private ArrayList<JavaFile> files = new ArrayList<>();

   public JavaProject(String name)
   {
      this.name = name;
   }

   public void addJavaFile(JavaFile file)
   {
      files.add(file);
   }

   public FileName getFileName(int index)
   {
      return files.get(index).getFileName();
   }

   public JavaFile getFirstJavaFileWithAMainMethod()
   {
      JavaFile first = null;
      for (int i = 0; i < files.size(); i++)
      {
         if (files.get(i).hasAMainMethod() == true)
         {
            first = files.get(i);
            break;
         }

      }
      return first;
   }

   public String getProjectName()
   {
      return this.name;
   }
}
