package school;
import java.util.ArrayList;

import student.ProxyStudent;
import student.Student;
import teacher.Teacher;

public class Course
{
   private String name;
   private ArrayList<Student> students;
   private Teacher teacher;
   
   public Course(String name, Teacher teacher) {
      this.name = name;
      this.teacher = teacher;
      students = new ArrayList<Student>();
   }
   
   public void addStudent(ProxyStudent student) {
      students.add(student);
   }
   
   public ProxyStudent getStudent(int index) {
      return (ProxyStudent)students.get(index);
   }
   
   public void removeStudent(String cpr) {
      for(int i = 0 ; i < students.size(); i++) {
         if(students.get(i).getCPR().equals(cpr)) {
            students.remove(i);
         }
      }
   }
   
   public int getStudentListSize() {
      return students.size();
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
   
   public String[] listOfStudents() {
      String[] listStudents = new String[students.size()];
      for(int i = 0 ; i < students.size(); i++) {
         listStudents[i] = students.get(i).toString();
      }
      return listStudents;
   }
   
}  
