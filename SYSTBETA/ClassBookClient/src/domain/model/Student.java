package domain.model;

public class Student extends Person
{
   private Math math;
   private Literature literature;
   private Knitting knitting;
   private Parent parent;
   
   public Student(String name, String CPR, Parent parent) {
      super(name, CPR);
      this.parent = parent;
   }
   
   public Math getMath() {
      return math;
   }
   
   public Literature getLiterature() {
      return literature;
   }
   
   public Knitting getKnitting() {
      return knitting;
   }
   
   public void setMath(Math math) {
      this.math = math;
   }
   
   public void setLiterature(Literature literature) {
      this.literature = literature;
   }
   
   public void setKnitting(Knitting knitting) {
      this.knitting = knitting;
   }
   
   public void setParent(Parent parent) {
      this.parent = parent;
   }
   
   public Parent getParent() {
      return parent;
   }
}
