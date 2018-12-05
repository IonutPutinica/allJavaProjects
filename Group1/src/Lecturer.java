
public class Lecturer extends Person
{
   private String specialization;
   private String salary;
   
   public Lecturer(String name, String specialization) {
      super(name);
      this.specialization = specialization;
   }
   public String getSpecialization() {
      return specialization;
   }
   public void setSpecialization(String specialization) {
      this.specialization = specialization;
   }
   public String getSalary() {
      return salary;
   }
   public void setSalary(String salary) {
      this.salary = salary;
   }
   public boolean equals(Object obj) {
      if(!(obj instanceof Lecturer)) {
         return false;
      }
      else {
         Lecturer other = (Lecturer) obj;
         return super.equals(other) && specialization == other.specialization;
      }
   }
   public String toString() {
      return super.toString() + ", Specialization: " + specialization + ", Salary: " + salary;
   }
}
