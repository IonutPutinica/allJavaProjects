
public class Journey extends Event
{
   private Date endDate;
   
   public Journey(String name, Date date) {
      super(name,date);
   }
   public Date getEndDate() {
      return endDate;
   }
   public void setEndDate(Date date) {
      endDate = date;
   }
   public boolean equals(Object obj) {
      if(!(obj instanceof Journey)) {
         return false;
      }
      else {
         Journey other = (Journey) obj;
         return super.equals(other);
      }
   }
   public String toString() {
      return super.toString() + ", Ending date: " + endDate;
   }
}
