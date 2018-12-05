
public class TestClass
{
   public static void main(String[] args)
   {
      Product product1 = new Product("Pita", 6.5);
      Product product2 = new Product("Pate", 10);
      OrderLine orderLine1 = new OrderLine(2, product1);
      OrderLine orderLine2 = new OrderLine(4, product2);
      Order order1 = new Order();
      order1.addProduct(orderLine1);
      order1.addProduct(orderLine2);
      for(int i=0;i<order1.getNumberOfOrderLines();i++)
      {
         System.out.println(order1.getOrderLine(i).getProduct()+" "+order1.getOrderLine(i).getAmount());
      }

   }
}
