package person;
import java.util.HashMap;
public class NameFactory
{
   private static final HashMap nameMap = new HashMap();
   // public
   
   public static IName getName(String name) {
      Name nameClass = (Name)nameMap.get(name);
      
      if(nameClass == null) {
         nameClass = new Name(name);
         nameMap.put(name, nameClass);
      }
      return nameClass;
   }
}
