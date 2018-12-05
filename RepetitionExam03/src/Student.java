import java.util.ArrayList;

public class Student
{
   private String name;
   private int studentNumber;
   private int numberOfExams;
   private ArrayList<Exam> exams;

   public Student(String name, int studentNumber)
   {
      this.name = name;
      this.studentNumber = studentNumber;
      numberOfExams = 0;
      exams = new ArrayList<Exam>();
   }

   public String getName()
   {
      return name;
   }

   public int getStudentNumber()
   {
      return studentNumber;
   }

   public void addExam(Exam exam)
   {
      exams.add(exam);
   }

   public int getTotalEcts()
   {
      int totalEcts = 0;
      for (int i = 0; i < exams.size(); i++)
         if (exams.get(i).isPassed())
         {
            totalEcts += exams.get(i).getEctsPoints();
         }
      return totalEcts;
   }

   public double getAverageGrade()
   {
      double numberOfGrades =0;
      double totalScore=0;
      ArrayList<GradedExam> graded=new ArrayList<GradedExam>();
      
      for (int i = 0; i < exams.size(); i++)
      {
         if (exams.get(i) instanceof GradedExam)
         {
            graded.add((GradedExam) exams.get(i));
            totalScore += graded.get(i).getGrade();
         }
      }
      numberOfGrades=graded.size();
      double avg=(double)numberOfGrades/totalScore;
      return avg;
   }
}
