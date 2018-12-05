package domain.mediator;
import java.rmi.Remote;

import domain.model.Course;
import domain.model.TeacherList;

public interface ServerInterface extends Remote
{
   public Course getCourse(ClientInterface client, String name);
   public void addCourse(ClientInterface client, Course course);
   public void removeCourse(ClientInterface client, String name);
   public String getCourseList(ClientInterface client);
   public TeacherList getTeacherList(ClientInterface client);
   public void setTeacherList(ClientInterface client, TeacherList teacherList);
}
