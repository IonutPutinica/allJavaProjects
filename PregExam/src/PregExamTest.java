
public class PregExamTest
{
   public static void main(String args[])
   {
      Preg sir1 = new Preg(5, 7);
      Preg sir2 = new Preg(100, 5);
      Preg sir3 = new Preg(3, 7);
      Preg sir4 = new Preg(12, 34);
      System.out.println(
            "The first number of the first list is " + sir1.getFirstNumber());
      System.out.println(
            "The second number of the first list is " + sir1.getSecondNumber());
      sir1.setFirstNumber(8);
      System.out.println(
            "After chaning the first number of the first list, the new list is "
                  + sir1.getFirstNumber() + " " + sir1.getSecondNumber());
      System.out.println("The second list is " + sir2.getFirstNumber() + " "
            + sir2.getSecondNumber());
      System.out.println("The sum of the first list is=" + sir1.getSum());
      System.out
            .println("The product of the second list is=" + sir2.getProduct());
      System.out.println("For the first list, the sum of the numbers is even= "
            + sir1.sumIsEven());
      System.out.println("For the second list, the sum of the numbers is even= "
            + sir2.sumIsEven());
      System.out.println("For the third list, the sum of the numbers is even= "
            + sir3.sumIsEven());
      System.out.println("The sum of the third list is= " + sir3.getTheSum());
      System.out.println(
            "---A sum is good when the sum is greater than 9 and even---");
      System.out.println(
            "For the first list, the sum is good= " + sir1.sumIsGood());
      System.out.println(
            "For the second list, the sum is good= " + sir2.sumIsGood());
      System.out.println(
            "For the third list, the sum is good= " + sir3.sumIsGood());
      System.out.println(
            "For the fourth list, the sum is good= " + sir4.sumIsGood());
      System.out.println(
            "---A list is perfect when the sum of the 2 numbers is even, greater than 9, and the product of the numbers is greater than 300");
      System.out.println("The first list is perfect= " + sir1.listIsPerfect());
      System.out.println("The second list is perfect= " + sir2.listIsPerfect());
      System.out.println("The third list is perfect= " + sir3.listIsPerfect());
      System.out.println("The fourth list is perfect= " + sir4.listIsPerfect());
   }
}
