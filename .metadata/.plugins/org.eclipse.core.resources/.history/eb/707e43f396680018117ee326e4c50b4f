package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import person.IName;
import person.Name;

public class NameTesting
{
   IName name = new Name("Name");

   @Test
   public void testNewName()
   {
      assertTrue(name != null);
   }

   @Test
   public void testGetName()
   {
      
      boolean check = name.getName() != null;
      assertTrue(check);
   }

   @Test
   public void testSetName()
   {
      String personName = name.getName();

      name.setName("Name5");

      if (personName != "Name5")
      {
         assertTrue(true);
      }
      else
      {
         assertTrue(false);
      }
   }

}