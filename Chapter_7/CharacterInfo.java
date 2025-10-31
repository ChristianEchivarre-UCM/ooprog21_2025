import java.util.Scanner;
public class CharacterInfo{
public static void main (String [] args){
Scanner c = new Scanner(System.in);
System.out.println("Input single character to convert to the following : ");
String a = c.nextLine();
StringBuilder sb = new StringBuilder(a);
StringBuilder upper = new StringBuilder(sb.toString().toUpperCase());
StringBuilder lower = new StringBuilder(sb.toString().toLowerCase());
System.out.println("The character is : " + a);
 System.out.println("Upper : " + upper);
 System.out.println("Lower : " + lower);
 char ch = a.charAt(0);
 if(Character.isUpperCase(ch)){
 System.out.println(ch + "is uppercase ");
 }
 else if(Character.isLowerCase(ch)){
 System.out.println(ch + " is lowercase ");
 }
 if(Character.isLetter(ch)){
 System.out.println(ch + " is letter ");
 }
 else if(Character.isDigit(ch)){
 System.out.println(ch + " is Digit ");
 }
 if(Character.isWhitespace(ch)){
 System.out.println(ch + " is white space ");
 }
 else{
 System.out.println(ch + " is not a white space " );
 }
 
       }
}
