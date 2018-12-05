
public class OrderLine
{
   private int amount;
   private Product product;

   public OrderLine(int amount, Product product)
   {
      this.amount = amount;
      this.product = product.copy();
   }

   public int getAmount()
   {
      return this.amount;
   }

   public Product getProduct()
   {
      return this.product.copy();
   }

   public double getPrice()
   {
      double price = product.getPrice() * amount;
      return price;
   }

   public boolean equals(OrderLine other)
   {
      if (!(other instanceof OrderLine))
         return false;
      OrderLine obj = (OrderLine) other;
      return this.product == obj.product && this.amount == obj.amount;
   }

   public OrderLine copy()
   {
      OrderLine copy = new OrderLine(amount, product);
      return copy;
   }
}
