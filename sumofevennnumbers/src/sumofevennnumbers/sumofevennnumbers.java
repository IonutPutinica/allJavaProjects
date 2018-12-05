package sumofevennnumbers;
import java.util.Scanner;

public class sumofevennnumbers
{
public static void main(String[] args)
{
   Scanner input=new Scanner(System.in);
   int n,i,s=0;
   System.out.println("n=");
   n=input.nextInt();
   for(i=0;i<=n;i+=2)
   {
      s+=i;
   }
   System.out.println("Sum is="+s);
   
}
}
