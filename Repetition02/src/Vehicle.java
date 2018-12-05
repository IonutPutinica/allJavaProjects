
public class Vehicle
{
   private String licensePlate;
   private double weight;

   public Vehicle(String licensePlate, double weight)
   {
      this.licensePlate = licensePlate;
      this.weight = weight;
   }

   public String getLicensePlate()
   {
      return licensePlate;
   }

   public double getWeight()
   {
      return weight;
   }

   public String toString()
   {
      return "The license plate is:" + licensePlate
            + " the weight of the car is:" + weight;
   }

   public boolean equals(Vehicle obj)
   {
      if (!(obj instanceof Vehicle))
         return false;
      else
      {
         Vehicle other = (Vehicle) obj;
         return other.getLicensePlate().equals(licensePlate)
               && other.getWeight() == this.weight;
      }
   }
}
