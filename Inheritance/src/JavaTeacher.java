
public class JavaTeacher extends Teacher
{

   String majourCourse = "Java";
   
   public JavaTeacher()
   {
      super("Director");
      System.out.println("I am the subclass");
   }
   
   void teach()
   {
      System.out.println("In vacation...");
   }
   

   public static void main(String[] args)
   {
      JavaTeacher jtObject = new JavaTeacher();
      System.out.println("Title: " + jtObject.title);
      System.out.println("Department: " + jtObject.dept);
      System.out.println("Majour Course: " + jtObject.majourCourse);
      jtObject.teach();
   }
}
