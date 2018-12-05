package testing;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import person.Person;

public class PersonTesting
{

   Person person = new Person("Person1", "2602950000");

   @Test
   public void testNewPerson()
   {
      assertTrue(person != null);
   }

   @Test
   public void testGetName()
   {

      boolean check = person.getName() != null;
      assertTrue(check);

   }

   @Test
   public void testSetName()
   {
      String personName = person.getName();

      person.setName("Person2");

      if (personName != "Person2")
      {
         assertTrue(true);
      }
      else
      {
         assertTrue(false);
      }
   }

   @Test
   public void testSetCPR()
   {
      String CPR = person.getCPR();
      person.setCPR("231298000");
      if (CPR != "2312980000")
      {
         assertTrue(true);

      }
      else
      {
         assertTrue(false);
      }

   }
}