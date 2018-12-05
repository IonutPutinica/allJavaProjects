package testing;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

public class NameFactoryTest
{

   @Test
   public void testHash()
   {

      HashMap<String, String> nameFactoryHashMap = new HashMap<>();
      nameFactoryHashMap.put("Name", "CPR");
      boolean check = nameFactoryHashMap.get("Name") != null;
      assertTrue(check);
   }
}


