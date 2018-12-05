package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import student.Subject;

public class SubjectTesting
{

   Subject subject = new Subject("Math");

   @Test
   public void testNewSubject()
   {
      assertTrue(subject != null);
   }

   @Test
   public void testSetAttendence()
   {
      String attendence = subject.getAttendance();
      subject.setAttendance("20");
      if (subject.getAttendance() == "20")
      {
         assertTrue(true);
      }
      else
         assertTrue(false);

   }

   @Test
   public void testGetAttendence()
   {
      subject.setAttendance("20");
      boolean check = subject.getAttendance() == "20";
      assertTrue(check);
   }

   @Test
   public void testSetGrades()
   {
      String grades = subject.getGrades();
      subject.setGrades("10, 7, 2, 10, 12 , 4");
      if (grades != "10, 7, 2, 10, 12 , 4")
      {
         assertTrue(true);
      }
      else
         assertTrue(false);
   }

   @Test
   public void testGetGrades()
   {
      subject.setGrades("2, 2, 7");
      boolean check = subject.getGrades() == "2, 2, 7";
   }
}