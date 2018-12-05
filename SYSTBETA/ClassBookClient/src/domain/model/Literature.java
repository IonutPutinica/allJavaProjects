package domain.model;
import java.util.ArrayList;

public class Literature
{
   private int attendance;
   private int fullAttendance;
   private ArrayList<Short> grades;
   
   
   public Literature() {
      attendance = 0;
      grades = new ArrayList<Short>();
   }
   
   public int getFullAttendance() {
      return fullAttendance;
   }
   
   public void addAttendance()
   {
      attendance++;
   }


   public void removeAttendance()
   {
      attendance--;
   }


   public void setAttendance(int attendance)
   {
      this.attendance = attendance;
   }

   public int getAttendance()
   {
      return attendance;
   }


   public void addGrade(short grade)
   {
      grades.add(grade);
   }

   public void removeGrade(int index)
   {
      grades.remove(index);
   }


   public short getGrade(int index)
   {
      return grades.get(index);
   }

   public String getGrades()
   {
      return grades + "";
   }
}
