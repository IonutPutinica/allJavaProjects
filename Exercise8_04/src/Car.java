
public class Car
{
private String owner;
private String color;
private String regnumber;

public Car(String owner, String color, String regnumber)
{
   this.owner= owner;
   this.color=color;
   this.regnumber=regnumber;
}
public void setOwner(String owner) {
   this.owner = owner;
}
public void setColor(String color) {
   this.color = color;
}
public void setRegnumber(String regnumber) {
   this.regnumber = regnumber;
}
public String getOwner() {
   return this.owner;
}
public String getColor() {
   return this.color;
}
public String getRegnumber() {
   return this.regnumber;
}
}

