
public class PersonMain
{
   public static void main(String args[])
   {
      Person Ionut = new Person("Ionut", "23.12.98");
      System.out.println("The name of the 1st person is=" + Ionut.getName()
            + " and the birthday is=" + Ionut.getBirthday());
      Ionut.setName("Aricel");
      System.out.println(
            "Oooops, the 1st person decided to change his name, now the name is="
                  + Ionut.getName());
   }
}
