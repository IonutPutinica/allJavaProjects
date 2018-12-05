package ws_01;

import java.util.Scanner;

public class ws_01
{
public static void main(String[] args)
{
   int n,i,sum=0;
   double division=0,factorial=1;
  
   Scanner input=new Scanner(System.in);
   System.out.print("Insert the value of n=");
   n=input.nextInt();
   for(i=0;i<n;i++)
   {
    sum=sum+i;

   }
   
   for(double j=1;j<=n;j++)
   {  
      factorial=factorial*j;     
      division = division+(j/(2*j+1));
   }
   System.out.println("1+2+3+...+n="+sum);
   System.out.println("n!="+factorial);
   System.out.println("division="+division);
   System.out.println("2^n="+Math.pow(2, n));
}
}
