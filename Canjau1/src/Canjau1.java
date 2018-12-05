import java.util.Scanner;
import java.util.Random;
public class Canjau1
{
    public static void main(String[] args) {
    Random nr = new Random();
    String optiune="Da";
    Scanner citire = new Scanner(System.in);
    while(optiune.equalsIgnoreCase("Da"))    
    {
    int numar = nr.nextInt(100);
    do
    {
        int read=citire.nextInt();
        if(read<numar)
        System.out.println("Introdu un numar mai mare");
        else if(read>numar)
        System.out.println("Introdu un numar mai mic");
    }while(citire.nextInt()!=numar);
        System.out.println("Numar ghicit,doresti sa mai joci o data?(Da/Nu)");
       optiune=citire.nextLine();
    }
}
}