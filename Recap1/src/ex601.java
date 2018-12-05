import java.util.ArrayList;
import java.util.Scanner;

public class ex601
{
   public static void main(String args[])
   {
      int max = 0, pos = 0, i, n, integer;
      Scanner input = new Scanner(System.in);
      ArrayList<Integer> arl = new ArrayList<Integer>();
      System.out
            .print("How many integers do you want your array list to have=");
      n = input.nextInt();
      for (i = 0; i < n; i++)
      {
         System.out.print("Input an integer=");
         integer = input.nextInt();
         arl.add(integer);
      }

      for (i = 0; i < arl.size(); i++)
      {
         if (arl.get(i) > max)
         {
            max = arl.get(i);
            pos = i;
         }
      }

      System.out.println(
            "The position of the largest element in the array list is=" + pos);
      if (arl.size() == 0)

         System.out.println("The array list is empty!!!!");
      else
         System.out.println(
               "The position of the largets element in the array list is=" + pos
                     + " and its value is=" + max);

   }
}
