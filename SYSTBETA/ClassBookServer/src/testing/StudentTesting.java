package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import student.Parent;
import student.RealStudent;
import student.Subject;

public class StudentTesting
{

   Parent parent = new Parent("Name", "1212120000");
   RealStudent student = new RealStudent("Ionut", "2312980000", parent);

   @Test
   public void testNewStudent()
   {
      assertTrue(student != null);
   }

   @Test
   public void testsetName()
   {
      String studentName = student.getName();
      student.setName("Flemming");
      if (studentName != "Flemming")
      {
         assertTrue(true);
      }
      else
      {
         assertTrue(false);
      }
   }

   @Test
   public void testGetName()
   {
      boolean check = student.getName() != null;
      assertTrue(check);
   }

}
