
public class GradedExam extends Exam
{
   public int grade;

   public GradedExam(String name, int ectsPoints, int grade)
   {
      super(name, ectsPoints);
      this.grade = grade;

   }

   public boolean isPassed()
   {
      return grade >= 2;
   }

   public int getGrade()
   {
      return grade;
   }

   public String toString()
   {
      return super.toString() + " the grade is= " + grade;
   }
}
