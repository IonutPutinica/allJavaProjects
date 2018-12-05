package school;
import java.util.ArrayList;

import teacher.TeacherList;

public class School
{
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
   
   public void removeCourse(String name) {
      for(int i = 0; i < courseList.size(); i++) {
         if(courseList.get(i).getName().equals(name)) {
            courseList.remove(i);         }
      }
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
   public static School getInstance() {
	   if(instance == null)
		   instance = new School();
	   return instance;
   }
}
