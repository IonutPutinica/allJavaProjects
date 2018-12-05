package domain.model;
import java.util.ArrayList;

public class TeacherList
{
   private ArrayList<Teacher> teacherList;
   
   public TeacherList() {
      teacherList = new ArrayList<Teacher>();
   }
   
   public void addTeacher(Teacher teacher) {
      teacherList.add(teacher);
   }
   
   public Teacher getTeacher(String CPR) {
      Teacher teacher = new Teacher("Teacher", "does not exist.");
      for(int i = 0; i < teacherList.size(); i++) {
         if(teacherList.get(i).getCPR().equals(CPR)) {
            teacher =  teacherList.get(i);
         }
      }
      return teacher;
   }
   public void removeTeacher(String CPR) {
      for(int i = 0; i < teacherList.size();i++) {
         if(teacherList.get(i).getCPR().equals(CPR)) {
            teacherList.remove(i);
         }
      }
   }
   
   public String getTeachers() {
      for(int i = 0; i < teacherList.size(); i++) {
         return teacherList.get(i).toString() + "\n";
      }
      return "\n";
   }
}
