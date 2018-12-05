import java.util.Scanner;
public class Exercise3_06
{
   public static void main(String[] args) {
      
     int a,b,max,min,sum;
     double div,mod;
      Scanner in = new Scanner(System.in);


      System.out.println("Enter a");
      a = in.nextInt();
      System.out.println("Enter b");
     b=in.nextInt();
     sum=a+b;
    
               if(a>b)
               {
                  max=a;
               }
               else
               {
                  max=b;
               }
               
               
               
               
               if(a<b)
               {
                  min=a;
               }
               else
               {
                  min=b;
               }
     
      
      System.out.println("The numbers sorted out are= "+min + "," + max);
      System.out.println("The sum is "+ sum);
      if(b!=0)
      {
         div=a/b;
         System.out.println("The division is: "+div);
      }
      else
      {
         System.out.println("Cannot divide by 0");
      }
      
      if(b!=0)
      {
        mod=a%b;
         System.out.println("The modulus is: "+mod);
      }
      else
      {
         System.out.println("Cannot divide by 0");
      }
    

   }
}
