package domain.model;
import java.util.ArrayList;

public class School
{
   private ArrayList<Course> courseList;
   private TeacherList teacherList;
   
   public School() {
      courseList = new ArrayList<Course>();
      teacherList = new TeacherList();
   }
   
   public void addCourse(Course course) {
      courseList.add(course);
   }
   
   public Course getCourse(String name) {
      Course course = new Course("Class does not exist", new Teacher("Exception", "Exception"));
      for(int i = 0; i < courseList.size(); i++) {
         if(courseList.get(i).getName().equals(name)) {
            course = courseList.get(i);
         }
      }
      return course;
   }
   
   public void removeCourse(String name) {
      for(int i = 0; i < courseList.size(); i++) {
         if(courseList.get(i).getName().equals(name)) {
            courseList.remove(i);         }
      }
   }
   
   public String getCourseList() {
      for(int i = 0; i < courseList.size();i++) {
         return courseList.get(i).toString() + "\n";
      }
      return "\n";
   }
   
   public void setTeacherList(TeacherList teacherList) {
      this.teacherList = teacherList;
   }
   
   public TeacherList getTeacherList() {
      return teacherList;
   }
   
   
}
