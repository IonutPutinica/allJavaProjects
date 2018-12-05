import java.util.Scanner;
public class Exercise3_08
{
 public static void main(String[] args)
 {
    int age;
 Scanner input = new Scanner(System.in);
 System.out.print("Type gender (M or F): ");
 String line = input.nextLine();
 char gender = line.charAt(0);
 System.out.println("Enter age");
 age = input.nextInt();
 
 
 if (gender == 'M' && age>=18)
 System.out.print("Man");

 if (gender == 'M' && age<18)
 System.out.print("Boy");
 if (gender == 'F' && age>=18)
 System.out.print("Woman");

 if (gender == 'F' && age<18)
 System.out.print("Girl");

}
}
