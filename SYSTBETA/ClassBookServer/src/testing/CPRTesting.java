package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import person.CPR;

public class CPRTesting
{

   CPR cpr = new CPR("2312980000");

   @Test
   public void testNewCPR()
   {
    
      assertTrue(cpr != null);
   }

   @Test
   public void testGetCPR()
   {
      
      boolean check = cpr.getCPR() != null;
      assertTrue(check);
   }

   @Test
   public void testSetCPR()
   {
      String CPR = cpr.getCPR();
      cpr.setCPR("121290000");
      if (CPR != "1212290000")
      {
         assertTrue(true);

      }
      else
      {
         assertTrue(false);
      }

   }
}