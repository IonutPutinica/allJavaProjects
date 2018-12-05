package exer2;
import java.util.Scanner;
public class exer2
{
   public static void main(String[] args)
   {
      int n,i,aux,j;
      
      Scanner input=new Scanner(System.in);
      System.out.print("Input the number of elements of the array=");
      n=input.nextInt();
      int []v=new int[n];
      for(i=0;i<n;i++)
      {
         System.out.print("v["+i+"]=");
         v[i]=input.nextInt();
      }
      for(i=0;i<n;i++)
      {
        aux=v[i];
        for(j=0;j<n;j++)
        {
           System.out.print(aux-v[j]+ " ");
           
      }
        System.out.println();
   }
   }
}
