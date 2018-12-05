import java.util.Scanner;
public class numbers3order
{
public static void main(String args[])
{
   Scanner input=new Scanner(System.in);
   int a,b,c;
   System.out.print("The first integer is=");
   a=input.nextInt();
   System.out.print("The 2nd integer is=");
   b=input.nextInt();
   System.out.print("The 3rd integer is=");
   c=input.nextInt();
   int max, min, mid;
   if(a>b && a>c)
      max=a;
   else
   {
      if(b>a && b>c)
         max=b;
      else
         max=c;
   }
   if(a<b && a<c)
      min=a;
   else
   {
      if(b<a && b<c)
         min=b;
      else
         min=c;
   }
   if((a==min && b==max) || (a==max && b==min))
      mid=c;
   else
   {
   if((b==min && c==max) || (b==max && c==min))
   mid=a;
   else
      mid=b;
   }
   System.out.println("The 3 numbers in order are:"+ min+ " "+mid+" "+max);
}
}
