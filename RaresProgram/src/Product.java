
public class Product
{
   private String name;
   private double price;

   public Product(String name, double price)
   {
      this.name = name;
      this.price = price;
   }

   public String getName()
   {
      return name;
   }

   public double getPrice()
   {
      return price;
   }

   public void setPrice(double price)
   {
      this.price = price;
   }

   public Product copy()
   {
      Product copy = new Product(name, price);
      return copy;
   }

   public String toString()
   {
      return "Product [name=" + name + ",price" + price + "]";
   }
}
