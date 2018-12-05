import java.util.ArrayList;

public class Order
{
   private ArrayList<OrderLine> orderLines = new ArrayList<>();

   public Order()
   {
    
   }

   public void addProduct(OrderLine orderLine)
   {
      orderLines.add(orderLine);
   }

   public int getNumberOfOrderLines()
   {
      return orderLines.size();
   }

   public OrderLine getOrderLine(int index)
   {
      OrderLine temp;
      temp = orderLines.get(index);
      return temp;
   }

   public double getTotalPrice()
   {
      double totalPrice = 0;
      for (int i = 0; i < orderLines.size(); i++)
      {
         totalPrice += orderLines.get(i).getPrice();
      }
      return totalPrice;
   }
}
