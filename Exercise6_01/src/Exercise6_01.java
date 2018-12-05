import java.util.Scanner;
import java.util.ArrayList;

public class Exercise6_01 {
   public static void main(String[] args) {

      int n;
      Scanner keyboard = new Scanner(System.in);

      System.out.print("How many elements do you want to have=");
      n = keyboard.nextInt();
      ArrayList<Integer> list = new ArrayList<Integer>(n);

      keyboard.nextLine();
      
      System.out.println("Input the elements: ");
      for (int i = 0; i < n; i++) {
         list.add(keyboard.nextInt());
      }
      keyboard.nextLine();
      
      int largestElement = list.get(0);
      
      for (int i = 0; i < list.size(); i++) {
         if (list.get(i) > largestElement) {
            largestElement = list.get(i);
         }
      }
      System.out.println("The index of the largest element is: " + list.indexOf(largestElement) + " and the element is: " + largestElement);
      
   }
}