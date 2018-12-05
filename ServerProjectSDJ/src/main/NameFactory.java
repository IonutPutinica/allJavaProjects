package main;
import java.util.HashMap;
public class NameFactory
{
   private static final HashMap<String, Name> membersByName = new HashMap<String, Name>();
   
   public static Name getMember(String name) {
      Name obj = (Name)membersByName.get(name);  
      if (obj == null) {
         obj = new Name(name);  
         membersByName.put(name, obj);
      } 
      return obj;
   }
}
