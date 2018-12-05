package domain.model;

public interface Subject
{
   public void addAttendance();
   public void removeAttendance();
   public void setAttendance(int attendance);
   public int getAttendance();
   public void addGrade(short grade);
   public void removeGrade(int index);
   public short getGrade(int index);
   public String getGrades();
}
