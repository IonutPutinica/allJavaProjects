package domain.model;
import java.util.ArrayList;

public class Course
{
   private String name;
   private ArrayList<Student> studentList;
   private Teacher teacher;
   
   public Course(String name, Teacher teacher) {
      this.name = name;
      this.teacher = teacher;
      studentList = new ArrayList<Student>();
   }
   
   public void addStudent(Student student) {
      studentList.add(student);
   }
   
   public Student getStudent(String CPR) {
      Student student = new Student("Student ","does not exist", new Parent("Exception.", "Exception"));
      for(int i = 0; i < studentList.size(); i++) {
         if(studentList.get(i).getCPR().equals(CPR)) {
            student = studentList.get(i);
         }
      }
      return student;
   }
   
   public void removeStudent(String CPR) {
      for(int i = 0; i < studentList.size();i++) {
         if(studentList.get(i).getCPR().equals(CPR)) {
            studentList.remove(i);
         }
      }
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public Teacher getTeacher() {
      return teacher;
   }
   
   public void setTeacher(Teacher teacher) {
      this.teacher = teacher;
   }
   
   public String studentsToString() {
      for(int i = 0; i < studentList.size();i++) {
         return studentList.get(i).toString() + "\n";
      }
      return "\n";
   }
}
