
public abstract class Exam
{
   private String courseName;
   private int ectsPoints;

   public Exam(String name, int ectsPoints)
   {
      this.courseName = courseName;
      this.ectsPoints = ectsPoints;
   }

   public String getCoursName()
   {
      return courseName;
   }
   public int getEctsPoints()
   {
      return ectsPoints;
   }
   public abstract boolean isPassed();

   public String toString()
   {
      return "The course name is= " + courseName
            + " and the amount of ECTS Points is= " + ectsPoints;
   }
}
