import java.util.Scanner;
public class MonthsChal {
   public static void main(String args[])
   {
      String month;
      String MonthArray[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
      int option=-1,i;
      Scanner citire = new Scanner(System.in);
      System.out.print("Month:");
      month=citire.next();
      for(i=0;i<MonthArray.length;i++)
         if(month.equalsIgnoreCase(MonthArray[i]))
         {
            option=i+1;
              break;
         }
         switch(option)
         {
         case 1: System.out.println(option);
         break;
         case 2: System.out.println(option);
         break;
         case 3: System.out.println(option);
         break;
         case 4: System.out.println(option);
         break;
         case 5: System.out.println(option);
         break;
         case 6: System.out.println(option);
         break;
         case 7: System.out.println(option);
         break;
         case 8: System.out.println(option);
         break;
         case 9: System.out.println(option);
         break;
         case 10: System.out.println(option);
         break;
         case 11: System.out.println(option);
         break;
         case 12: System.out.println(option);
         break;
         default: System.out.println(option);
         break;
         }
      }  
   }