
public class Student
{
   private String name;
   private char gender;
   private int studynumber;

   public Student(String name, char gender, int studynumber)
   {
      this.name = name;
      this.gender = gender;
      this.studynumber = studynumber;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public char getGender()
   {
      return gender;
   }

   public void setGender(char gender)
   {
      this.gender = gender;
   }

   public int getStudynumber()
   {
      return studynumber;
   }

   public void setStudynumber(int studynumber)
   {
      this.studynumber = studynumber;
   }

   public String toString()
   {
      String all = "";
      all += name;
      return all;
   }
}
