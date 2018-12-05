package domain.model;

public class Person
{
   private String name;
   private String CPR;
   
   public Person(String name, String CPR) {
      this.name = name;
      this.CPR = CPR;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public String getCPR() {
      return CPR;
   }
   
   public void setCPR(String CPR) {
      this.CPR = CPR;
   }
}
