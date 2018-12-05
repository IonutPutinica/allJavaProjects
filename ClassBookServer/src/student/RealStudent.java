package student;
import java.util.ArrayList;

import person.Person;
import school.Course;

public class RealStudent extends Person implements Student
{

   private Subject[] subjects;
   private Parent parent;
   private Course course;
   
   
   public RealStudent(String name, String cpr, Parent parent)
   {
      super(name, cpr);
      subjects = new Subject[2];
      this.parent = parent;
   }

   
   public Parent getParent()
   {
      return parent;
   }

   
   public void setParent(Parent parent)
   {
      this.parent = parent;
      
   }
   
   public String[] listSubjects()
   {
      String[] ret = new String[2];
      ret[0] = getMath().toString();
      ret[1] = getLiterature().toString();
      return ret;
   }


   @Override
   public void setMath(Subject subject)
   {
      subjects[0] = subject;
      
   }


   @Override
   public Subject getMath()
   {
      
      return subjects[0];
   }


   @Override
   public void setLiterature(Subject subject)
   {
      subjects[1] = subject;
      
   }


   @Override
   public Subject getLiterature()
   {
      return subjects[1];
   }


   @Override
   public void setCourse(Course course)
   {
      this.course = course;
      
   }


   @Override
   public Course getCourse()
   {
      return course;
   }
   
   
}
