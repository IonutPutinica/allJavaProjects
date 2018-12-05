import java.util.ArrayList;
public class Event
{
   private String name;
   private String category;
   private String location;
   private Time duration;
   private int memberLimit;
   private boolean isFinalized;
   private Date date;
   private double price;
   private ArrayList<Lecturer> lecturers;
   private Time scheduledTime;
   
   public Event(String name, Date date) {
      this.name = name;
      this.date = date;
      lecturers = new ArrayList<Lecturer>();
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getCategory() {
      return category;
   }
   public void setCategory(String category) {
      this.category = category;
   }
   public String getLocation() {
      return location;
   }
   public void setLocation(String location) {
      this.location = location;
   }
   public Time getDuration() {
      return duration;
   }
   public void setDuration(Time duration) {
      this.duration = duration;
   }
   public boolean isFinalized() {
      return isFinalized;
   }
   public void setFinalized(boolean isFinalized) {
      this.isFinalized = isFinalized;
   }
   public int getMemberLimit() {
      return memberLimit;
   }
   public void setMemberLimit(int memberLimit) {
      this.memberLimit = memberLimit;
   }
   public Date getDate() {
      return date;
   }
   public void setDate(Date date) {
      this.date = date;
   }
   public double getPrice() {
      return price;
   }
   public void setPrice(double price) {
      this.price = price;
   }
   public void addLecturer(Lecturer lecturer) {
      lecturers.add(lecturer);
   }
   public Lecturer[] getLecturers(){
      Lecturer[] lecs = new Lecturer[lecturers.size()];
      for(int i = 0; i < lecturers.size(); i++) {
         lecs[i] = lecturers.get(i);
      }
      return lecs;
   }
   public void setScheduedTime(Time time) {
      scheduledTime = time;
   }
   public Time getScheduledTime() {
      return scheduledTime;
   }
   public String toString() {
      return "Name: " + name + ", Category: " + category + ", Location: " + location +
            ", Duration: " + duration.toString() + ", Member limit: " + ", Price: " + price + ", Scheduled time: " +
            scheduledTime.toString() + ", Lecturers: " + lecturers + ", Date: " + date;
   }
   public boolean equals(Object obj) {
      if(!(obj instanceof Event)) {
         return false;
      }
      else {
         Event other = (Event) obj;
         return name == other.name && date == other.date;
      }
   }
}
