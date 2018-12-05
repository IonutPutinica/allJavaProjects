package student;

import school.Course;

public interface Student {
   
   
   public Parent getParent();
   
   public void setParent(Parent parent);

   public void setMath(Subject subject);
   
   public Subject getMath();
   
   public void setLiterature(Subject subject);
   
   public Subject getLiterature();
   
   public String[] listSubjects();
   
   public String getName();
   
   public void setName(String name);
   
   public String getCPR();
   
   public void setCPR(String cpr);
   
   public void setCourse(Course course);
   
   public Course getCourse();

}
