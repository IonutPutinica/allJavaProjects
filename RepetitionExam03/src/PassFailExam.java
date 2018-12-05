
public class PassFailExam extends Exam
{
   private boolean passed;

   public PassFailExam(String name, int ectsPoints, boolean passed)
   {
      super(name, ectsPoints);
      this.passed = passed;
   }

   public boolean isPassed()
   {
      return passed;
   }

   public String toString()
   {
      return super.toString() + " the exam is passed=" + passed;
   }
}