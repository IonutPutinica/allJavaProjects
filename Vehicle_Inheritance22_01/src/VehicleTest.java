public class VehicleTest {
   public static void main(String[] args) {
      Vehicle[] vehicles = new Vehicle[4];
      vehicles[0] = new Bicycle("Bob", 2500, 5);
      vehicles[1] = new Car("Carl", 80000, "BZ34794");
      vehicles[2] = new SportsCar("Sally", 1200000, "SC21512", 290);
      vehicles[3] = new Van("Vallery", 990000, "VC11222", 8000);
      for (int i = 0; i < vehicles.length; i++) {
         System.out.println(vehicles[i].toString());
      }
   }

}