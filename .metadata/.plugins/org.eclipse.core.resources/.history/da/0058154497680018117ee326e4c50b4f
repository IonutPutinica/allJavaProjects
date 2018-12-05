package domain.model;
import java.io.Serializable;
import java.util.ArrayList;


public class School implements Serializable
{
   private static final long serialVersionUID = 1L;
   private ArrayList<Course> courseList;
   private TeacherList teacherList;
   private static School instance;
      
   public School() {
      courseList = new ArrayList<Course>();
      teacherList = new TeacherList();
   }
   
   public void addCourse(Course course) {
      courseList.add(course);
   }
   
   public Course getCourse(int index) {
      return courseList.get(index);
   }
   
   public void removeCourse(int index) {
      courseList.remove(index);
   }
   
   public int getCourseListSize() {
      return courseList.size();
   }
   
   public void setTeacherList(TeacherList teacherList) {
      this.teacherList = teacherList;
   }
   
   public TeacherList getTeacherList() {
      return teacherList;
   }
   
   //singleton
   private static School getInstance() {
	   if(instance == null)
		   instance = new School();
	   return instance;
   }
}
