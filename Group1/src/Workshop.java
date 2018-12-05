import java.util.ArrayList;
public class Workshop extends Event
{
   private boolean includesMeal;
   private ArrayList<String> subjects;
   private Date endDate;
   
   Workshop(String name, Date date){
      super(name,date);
      subjects = new ArrayList<String>();
   }
   public Date getEndDate() {
      return endDate;
   }
   
   public void setEndDate(Date date) {
      endDate = date;
   }
   
   public boolean includesMeals() {
      return includesMeal;
   }
   
   public void setIncludesMeals(boolean includesMeal) {
      this.includesMeal = includesMeal;
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
         if(subject.equals(subjects.get(i))) {
            subjects.remove(i);
         }
      }
   }
   public boolean equals(Object obj) {
      if(!(obj instanceof Workshop)) {
         return false;
      }
      else {
         Workshop other = (Workshop) obj;
         return super.equals(other);
      }
   }
   public String toString() {
      return super.toString() + ", Ending date: " + endDate + ", Subjects: " + getSubjects();
   }
}
