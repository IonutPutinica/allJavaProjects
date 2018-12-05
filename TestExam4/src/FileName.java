
public class FileName
{
   private String name;
   private String extension;

   public FileName(String name, String extension)
   {
      this.name = name;
      this.extension = extension;
   }

   public void set(String name, String extension)
   {
      this.name = name;
      this.extension = extension;
   }

   public String getName()
   {
      return name;
   }

   public String getExtension()
   {
      return extension;
   }
   public String getFullName()
   {
      String fullName=name+"."+extension;
      return fullName;
   }
   public FileName copy()
   {
      FileName copy=new FileName(name, extension);
      return copy;
   }
}
