package ex1;


public class proj {
   public static void main(String args[])
   {
      int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
      int sum=0,elm,i;
      for(i=0;i<days.length;i++)
         sum+=days[i];
      for(i=0;i<days.length;i++)
      {
         System.out.println(sum-days[i]);
         sum-=days[i];
      }
   }
}