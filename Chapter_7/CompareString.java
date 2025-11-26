import java.util.Scanner;
public class CompareString{
public static void main(String [] args){
Scanner s = new Scanner(System.in);
System.out.println("Enter your name > ");
String name1 = s.nextLine();
StringBuilder name = new StringBuilder("Carmen");
if(name.toString().equals(name1)){
System.out.println(name1 + " is equal to " + name);
}
else{
System.out.println(name1 + " is not equal to " + name);
}
}
}
