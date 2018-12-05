package person;

public class Person
{
   private IName name;
   private ICPR cpr;
   
   public Person(String name, String cpr) {
      this.name = new Name(name);
      this.cpr = new CPR(cpr);
   }
   
   public String getName() {
    return name.getName();  
   }
   
   public void setName(String value) {
      name.setName(value);
   }
   
   public String getCPR() {
      return cpr.getCPR();
   }
   
   public void setCPR(String value) {
      cpr.setCPR(value);
   }
   
   public String toString() {
      return name.getName() + " " + cpr.getCPR();
   }
}
