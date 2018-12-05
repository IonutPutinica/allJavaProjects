import java.util.ArrayList;
public class Seminar extends Event
{
   private ArrayList<String> subjects;
   
   public Seminar(String name, Date date) {
      super(name,date);
      subjects = new ArrayList<String>();
   }
   public String[] getSubjects() {
      String[] sbj = new String[subjects.size()];
      for(int i = 0; i < subjects.size(); i++) {
         sbj[i] = subjects.get(i);
      }
      return sbj;
   }
   public void addSubject(String subject) {
      subjects.add(subject);
   }
   public void removeSubject(String subject) {
      for(int i = 0; i < subjects.size(); i++) {
         if(subjects.get(i).equals(subject)) {
            subjects.remove(i);
         }
      }
   }
   public boolean equals(Object obj) {
      if(!(obj instanceof Seminar)) {
         return false;
      }
      else {
         Seminar other = (Seminar) obj;
         return super.equals(other);
      }
   }
   public String toString() {
      return super.toString() + ", Subjects: " + getSubjects();
   }
}
