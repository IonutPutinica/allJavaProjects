import java.util.Scanner;
import java.util.Random;
public class GhicesteNumarul
{
  public static void main(String[] args)
  {
    Random nr = new Random();
    String optiune="Da";
    Scanner citire = new Scanner(System.in);
    int vieti=3;
    while(optiune.equalsIgnoreCase("Da") && vieti>0)    
    {
    int numar = nr.nextInt(100),ok=0,incercari=3;
       do
       {
         int read=citire.nextInt();
         incercari--;
         if(read<numar)
            System.out.println("Introdu un numar mai mare("+incercari+" incercari ramase)");
         else if(read>numar)
            System.out.println("Introdu un numar mai mic("+incercari+" incercari ramase)");
         else if(read==numar)
         ok=1;
       }while(ok==0 && incercari>0);
    if(ok==1){
        System.out.println("Numar ghicit,doresti sa mai joci o data?(Da/Nu)");
        optiune=citire.next();
    }
    else{ vieti--;
          System.out.println(vieti+" vieti ramase");
    }
    if(vieti==0) break;
   }
 }
}