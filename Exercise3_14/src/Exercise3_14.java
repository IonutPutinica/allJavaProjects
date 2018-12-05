import java.util.Scanner;
public class Exercise3_14 {
  public static void main(String args[])
  {
     int day,month,year,done=1;
     int MonthArray[]= {31,28,31,30,31,30,31,31,30,31,30,31};
     Scanner citire= new Scanner(System.in);
     System.out.println("--Enter the date--");
     System.out.print("Day:");
     day=citire.nextInt();
     System.out.print("Month:");
     month=citire.nextInt();
     System.out.print("Year:");
     year=citire.nextInt();
     if(month<=0 || month>12)
        done=0;
     if(day<=0)
        done=0;
     switch(month)
     {
     case 1: if(day>31)
            done=0;
     break;
     case 2: if(day>28)
            done=0;
     break;
     case 3: if(day>31)
             done=0;
     break;
     case 4:  if(day>30)
              done=0;
     break;
     case 5:  if(day>31)
              done=0;
      break;
     case 6:   if(day>30)
               done=0;
     break;
     case 7:   if(day>31)
                done=0;
     break;
     case 8:   if(day>31)
               done=0;
     break;
     case 9:   if(day>30)
                done=0;
     break;
     case 10:  if(day>31)
               done=0;
     break;
     case 11:   if(day>30)
                done=0;
     break;
     case 12:   if(day>31)
                done=0;
     break;
     }
     if(done==1)
        System.out.println(day+"/"+month+"/"+year);
     else 
        System.out.println("Illegal date");
  }
}