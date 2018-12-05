import java.util.Scanner;
public class MinMaxAvgArray
{
public static void main(String[] args)
{
   Scanner input=new Scanner(System.in);
   int i,max,min,n;
   double avg;
   System.out.print("Input the number of elements of the array=");
   n=input.nextInt();
   int []v=new int[n];
   System.out.println("Introduce the elements of the array");
   for(i=0;i<n;i++)
   {
      System.out.print("v["+i+"]=");
      v[i]=input.nextInt();
   }
   max=-6969;
   min=6969;
   for(i=0;i<n;i++)
   {
      if(v[i]>max)
      {
         max=v[i];
      }
   }
   for(i=0;i<n;i++)
   {
      if(v[i]<min)
      {
         min=v[i];
      }
   }
   avg=(double)(max+min)/2;
   System.out.println("The avg of max and min is="+avg);
   
}
}
