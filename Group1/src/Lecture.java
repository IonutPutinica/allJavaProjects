
public class Lecture extends Event
{
   private String subject;
   
   Lecture(String name, Date date){
      super(name,date);
   }
   public String getSubject() {
      return subject;
   }
   public void setSubject(String subject) {
      this.subject = subject;
   }
   public boolean equals(Object obj) {
      if(!(obj instanceof Lecture)) {
         return false;
      }
      else {
         Lecture other = (Lecture) obj;
         return super.equals(other);
      }
   }
   public String toString() {
      return super.toString() + ", Subject: " + subject;
   }
   
}
