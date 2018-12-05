import java.util.Arrays;

public class HandIn2Test
{

   public static void main(String[] args)
   {
      Car car1 = new Car("XZ3625", 2549);

      System.out.println("RegNumber:" + car1.getRegistrationNumber()
            + "\nMileage: " + car1.getMileage() + car1.getServiceBook());
      System.out.println("");

      car1.service();
      car1.drive(350);
      car1.service(new Date(12, 10, 2017));

      System.out.println(car1);

      Car car2 = new Car("BV1047", 3208);
      car2.service();
      car2.drive(800);
      car2.service(new Date(12, 10, 2017));
      car2.setRegistrationNumber("XZ3625");

      Car car3 = new Car("MN2258", 1584);

      System.out.println("");
      System.out.println(car1.equals(car2));
      System.out.println(car1.equals(car3));

      ServiceBook book1 = car1.getServiceBook();
      car1.drive(800);
      car1.service(new Date(18, 10, 2017));
      System.out.println(book1);
      System.out.println("Last service: " + book1.getDateOfLastService());
      System.out.println("Number of services: " + book1.getNumberOfServices());
      System.out.println("Has service on date 10.10.2017: "
            + book1.hasServiceOnDate(new Date(10, 10, 2017)));
      System.out.println("Has service on date 11.10.2017: "
            + book1.hasServiceOnDate(new Date(11, 10, 2017)));
      System.out.println("All services mileage: "
            + Arrays.toString(book1.getAllServicesMileage()));
      System.out.println("All services: ");
      Service[] servicesArr = book1.getAllServices();
      for (Service e : servicesArr)
         System.out.println(e);

      Service serv = servicesArr[0];
      System.out.println("");
      System.out.println("Service" + serv.getMileage() + " " + serv.getDate());
      System.out.println("Is leap year: " + serv.getDate().isLeapYear());
   }
}