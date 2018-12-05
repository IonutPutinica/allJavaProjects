
public class JavaFile
{
   private boolean hasAMainMethod;
   private FileName fileName;

   public JavaFile(String fileName)
   {
      this.fileName = new FileName(fileName, "java");
   }

   public FileName getFileName()
   {
      return fileName;
   }

   public boolean hasAMainMethod()
   {
      return hasAMainMethod;
   }

   public void addMainMethod()
   {
      hasAMainMethod = true;
   }
   public String toString() {
      String s="File name=["+fileName+"]"+" Method=["+hasAMainMethod+"]";
      return s;
   }
}
