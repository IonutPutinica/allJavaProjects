
public class NameTest
{
public static void main(String[] args)
{
   Name name1=new Name("Cristian","Popina");
   Name name2=new Name("Ionut","Canjau");
   Name name3=new Name("Chuck Norris");
   System.out.println("The 2 names are=");
   System.out.println(name1.getFullName());
   System.out.println(name2.getFullName());
   System.out.println("The 2 formal names are=");
   System.out.println(name1.getFormalName());
   System.out.println(name2.getFormalName());
   System.out.print("Chuck Norris=");
   System.out.println(name3.getFullName());
}
}
