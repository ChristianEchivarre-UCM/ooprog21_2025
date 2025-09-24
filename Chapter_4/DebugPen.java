public class DebugPen
{
private String color;
private String point;
public DebugPen()
{
color = "black";
point = "fine";
}
public DebugPen(String color, String point)
{
this.color = color;
this.point = point;
}
public String getColor()
{
return color;
}
public String getPoint()
{
return point;
}
public static void main(String [] args){
DebugPen pen1 = new DebugPen();
DebugPen pen2 = new DebugPen("Blue", "Medium");
System.out.println("The color of the default pen is " + pen1.getColor() + " And the point is " + pen1.getPoint()); 
System.out.println("The color of the custom pen is " + pen2.getColor() + " And the point is " + pen2.getPoint());
}
}
