import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.After;

import utility.collection.ArrayStack;
import utility.collection.StackADT;

public class ArrayStackTest
{
   private StackADT<String> stack;

   @Before
   public void setUP() throws Exception
   {
      stack = new ArrayStack<>();
   }

   @After
   public void tearDown() throws Exception
   {
      // do nothing
   }

   @Test
   public void testPushAndPeekAFew()
   {
      stack.push("$A$");
      assertEquals("$A$",stack.pop());
      stack.push("$B$");
      stack.push("$D$");
      assertEquals("$D$", stack.pop());
      assertEquals("$B$", stack.pop());
      try
      {
         stack.push(null);
         assertEquals(null, stack.pop());
         stack.push(null);
         stack.push("$A$");
         assertEquals("$A$", stack.pop());
         assertEquals(null,stack.pop());
              
      }
      catch (IllegalArgumentException e)
      {
         //OK
      }
      
      
   }

}
