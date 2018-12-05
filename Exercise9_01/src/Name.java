
public class Name
{
private String firstName;
private String lastName;

public Name(String firstName,String lastName)
{
   this.firstName=firstName;
   this.lastName=lastName;
}
public void setfirstName(String firstName)
{
   this.firstName=firstName;
}
public void setlastName(String lastName)
{
   this.lastName=lastName;
}
public String getfirstName()
{
   return this.firstName;
}
public String getlastName()
{
   return this.lastName;
}
public String getFullName()
{
   return this.firstName+ " " +this.lastName;
   
}
public String getFormalName()
{
   return this.lastName+","+this.firstName;
}
public Name(String fullName)
{
   String[] nameparts = fullName.split(" ");
   firstName = nameparts[0];
   lastName = nameparts[1];
}
}