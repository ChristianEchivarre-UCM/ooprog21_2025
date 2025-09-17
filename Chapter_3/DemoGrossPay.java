public class DemoGrossPay{
public static void main(String []args){

double firsth = 10.0;
double secondh = 25.0;
double thirdh = 37.5;
calculateGross(firsth, secondh, thirdh);
}
public static void calculateGross(double firsth, double secondh, double thirdh){
final double rate = 22.75;
double finalrate1 = firsth * rate;
double finalrate2 = secondh * rate;
double finalrate3 = thirdh * rate;
System.out.println("10.0 hours at $22.75 per hour is $" + finalrate1);
System.out.println("25.0 hours at $22.75 per hour is $" + finalrate2);
System.out.println("37.5 hours at $22.75 per hour is $" + finalrate3);
}
}
