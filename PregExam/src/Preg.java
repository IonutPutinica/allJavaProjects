
public class Preg
{
   private int firstNumber;
   private int secondNumber;

   public Preg(int firstNumber, int secondNumber)
   {
      this.firstNumber = firstNumber;
      this.secondNumber = secondNumber;

   }

   public void setFirstNumber(int firstNumber)
   {
      this.firstNumber = firstNumber;
   }

   public int getFirstNumber()
   {
      return firstNumber;
   }

   public void setsecoundNumber(int secondNumber)
   {
      this.secondNumber = secondNumber;
   }

   public int getSecondNumber()
   {
      return secondNumber;
   }

   public int getSum()
   {
      return firstNumber + secondNumber;
   }

   public int getProduct()
   {
      return firstNumber * secondNumber;
   }

   public boolean sumIsEven()
   {
      if ((firstNumber + secondNumber) % 2 == 0)
         return true;
      else
         return false;
   }

   public int getTheSum()
   {
      int sum = firstNumber + secondNumber;
      return sum;
   }

   public boolean sumIsGood()
   {
      if (getTheSum() >= 9 && sumIsEven())
      {
         return true;
      }
      return false;

   }

   public boolean listIsPerfect()
   {
      if (getProduct() >= 300 && sumIsGood())
      {
         return true;
      }
      return false;
   }
}
