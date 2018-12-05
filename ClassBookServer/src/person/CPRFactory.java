package person;
import java.util.HashMap;

public class CPRFactory
{
   private static final HashMap cprMap = new HashMap();
   
   
   public static ICPR getCPR(String cpr) {
      CPR cprClass = (CPR)cprMap.get(cpr);
      
      if(cprClass == null) {
         cprClass = new CPR(cpr);
         cprMap.put(cpr, cprClass);
      }
      return cprClass;
   }
}
