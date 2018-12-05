import java.util.Scanner;
import java.util.Random;
public class Canjau
{
    public static void main(String[] args) {
    Random nr = new Random();
    int numar = nr.nextInt(100);
    Scanner citire = new Scanner(System.in);
    int read = citire.nextInt();
    while(read!=numar)
    {
        if(read<numar)
        System.out.println("Insert a bigger number");
        if(read>numar)
        System.out.println("insert a smaller number");
        read=citire.nextInt();
    }
        System.out.println("You got it!!!!");
    }
}