package teacher;
import java.util.ArrayList;


public class TeacherList
{
   private ArrayList<Teacher> teacherList;
   private static TeacherList instance;
   
   public TeacherList() {
      teacherList = new ArrayList<Teacher>();
   }
   
   public void addTeacher(Teacher teacher) {
      teacherList.add(teacher);
   }
   
   public Teacher getTeacher(int index) {
      return teacherList.get(index);
   }
   
   public void removeTeacher(String CPR) {
      for(int i = 0; i < teacherList.size();i++) {
         if(teacherList.get(i).getCPR().equals(CPR)) {
            teacherList.remove(i);
         }
      }
   }
   
   public String[] listTeachers() {
      String[] teachers = new String[teacherList.size()];
      for(int i = 0; i < teacherList.size(); i++) {
         teachers[i] = teacherList.get(i).toString();
      }
      return teachers;
   }
   
   public static TeacherList getInstance() {
      if(instance == null)
         instance = new TeacherList();
      return instance;
   }
   
   public int size() {
      return teacherList.size();
   }
}
