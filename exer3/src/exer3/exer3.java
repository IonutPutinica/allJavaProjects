package exer3;


import java.util.Scanner;


public class exer3
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
     j=i-1;
     i=0;
     while(i<j)
     {
        aux=v[i];
        v[i]=v[j];
        v[j]=aux;
        i++;
        j--;
        
     }
     for(i=0;i<n;i++)
     System.out.print(v[i]+" ");
   }
   }



