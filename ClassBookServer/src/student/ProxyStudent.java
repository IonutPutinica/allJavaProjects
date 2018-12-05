package student;

import school.Course;

public class ProxyStudent implements Student {

   private RealStudent student;
   
   public ProxyStudent(String name, String cpr, Parent parent) {
      student = new RealStudent(name, cpr, parent);
   }

   public Parent getParent()
   {
      return student.getParent();
   }

   public void setParent(Parent parent)
   {
      student.setParent(parent);
      
   }   
   
   public String[] listSubjects()
   {
      
      return student.listSubjects();
   }
   
   public String getCPR() {
      return student.getCPR();
   }
   
   public void setCPR(String cpr) {
      student.setCPR(cpr);
   }
   
   public String getName() {
      return student.getName();
   }
   
   public void setName(String name) {
      student.setName(name);
   }

   @Override
   public void setMath(Subject subject)
   {
      student.setMath(subject);
      
   }

   @Override
   public Subject getMath()
   {
      return student.getMath();
   }

   @Override
   public void setLiterature(Subject subject)
   {
      student.setLiterature(subject);      
   }

   @Override
   public Subject getLiterature()
   {
      return student.getLiterature();
   }

   @Override
   public void setCourse(Course course)
   {
      student.setCourse(course);
      
   }

   @Override
   public Course getCourse()
   {
      return student.getCourse();
   }
}
