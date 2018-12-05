import java.util.ArrayList;
public class LecturerList
{
   private ArrayList<Lecturer> lecturers;
   
   public LecturerList() {
      lecturers = new ArrayList<Lecturer>();
   }
   public void addLecturer(Lecturer lecturer) {
      lecturers.add(lecturer);
   }
   public Lecturer[] getLecturers() {
      Lecturer[] lec = new Lecturer[lecturers.size()];
      for(int i = 0; i < lecturers.size(); i++) {
         lec[i] = lecturers.get(i);
      }
      return lec;
   }
   public void removeLecturer(Lecturer lecturer) {
      for(int i = 0; i < lecturers.size(); i++) {
         if(lecturers.get(i).equals(lecturer)) {
            lecturers.remove(i);
         }
      }
   }
}
