
public class CarTest
{
   public static void main(String[] args) {
Car car1=new Car("Michael","white","533.235");
Car car2=new Car("Josh","black","690.889");
System.out.println("The data of the 2 cars:");
System.out.println("The 1st car is owned by "+car1.getOwner()+" has the color "+car1.getColor()+" and has the registration number: "+car1.getRegnumber());
System.out.println("The 2nd car is owned by "+car2.getOwner()+" has the color "+car2.getColor()+" and has the registration number: "+car2.getRegnumber());
System.out.println("-------------------------");
System.out.println("The 1st car was sold to Chris and repainted red");
car1.setOwner("Chris");
car1.setColor("red");
System.out.println("The 2nd was in an accident:it got repainted yellow and got a new registration number");
car2.setColor("yellow");
car2.setRegnumber("832.036");
System.out.println("After one of them is being sold, and the other is involved in an accident, the new data of the cars is :");
System.out.println("The 1st car is owned by "+car1.getOwner()+" has the color "+car1.getColor()+" and has the registration number: "+car1.getRegnumber());
System.out.println("The 2nd car is owned by "+car2.getOwner()+" has the color "+car2.getColor()+" and has the registration number: "+car2.getRegnumber());
}
}