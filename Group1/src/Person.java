
public class Person
{
   private String name;
   private String phoneNumber;
   private String emailAdress;
   
   public Person(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getPhoneNumber() {
      return phoneNumber;
   }
   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }
   public String getEmailAdress() {
      return emailAdress;
   }
   public void setEmailAdress(String emailAdress) {
      this.emailAdress = emailAdress;
   }
   public boolean equals(Object obj) {
      if(!(obj instanceof Person)) {
         return false;
      }
      else {
         Person other = (Person) obj;
         return name == other.name;
      }
   }
   public String toString() {
      return "Name: " + name + ", Phone number:" + phoneNumber + ", Email adress: " + emailAdress;
   }
}
