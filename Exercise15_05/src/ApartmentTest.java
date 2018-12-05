
public class ApartmentTest
{
   public static void main(String[] args)
   {
        Apartment apartment1= new Apartment("Str. Flowers",500);
        
        apartment1.rentTo("John", "521521512");
        System.out.println(apartment1);
   }
}
