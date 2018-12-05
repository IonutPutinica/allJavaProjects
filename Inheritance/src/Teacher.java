
public class Teacher
{
   String title = "Associate Professor";
   String dept = "ICT";

   public Teacher()
   {
      System.out.println("Sobolan");
   }
   
   public  Teacher(String title)
   {
    this.title=title;  
   }
   void teach()
   {
      System.out.println("Teaching...");
   }
}
