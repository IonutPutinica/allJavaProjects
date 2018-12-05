import java.util.Scanner;
public class AscSorting
{
public static void main(String[] args)
{
   Scanner input=new Scanner(System.in);
   int n,i,aux,j;
   System.out.print("Insert the amount of numbers you want to test out=");
   n=input.nextInt();
   int [] v=new int[n];
   //Reading the elements of the array
   System.out.println("Introduce the elements of the array");
   for(i=0;i<n;i++)
   {
      System.out.print("v["+ i+"]=");
      v[i]=input.nextInt();
   }
   //Sorting
   for(i=0;i<n-1;i++)
   {
      for(j=i+1;j<n;j++)
      {
      if(v[i]>v[j])
      {
         aux=v[i];
         v[i]=v[j];
         v[j]=aux;
         
      }
   }

}
for(i=0;i<n;i++)
{
   System.out.print(v[i]+ " ");
}
}
}


