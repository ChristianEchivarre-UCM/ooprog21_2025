public class Payroll{
public static void main(String [] args){
Employee e = new Employee(45, 9999);
double rate = e.overTimeR;
int payrate = e.payRate;
double mRate = e.maxRate;
double regularP = (e.gethoursWork() - 5) * payrate;
double overTimeP = (e.overTimeR * e.payRate) * 5;
System.out.println("How many hours work did you work this week? " + e.gethoursWork());
System.out.println("What is your regular pay rate? " + payrate);
System.out.println("Regular Pay is : " + regularP);
System.out.println("Over timme pay is : " +  overTimeP);
}
}
class Employee{
private int hoursWork; 
private int employeeN;
final double overTimeR = 1.5;
final int payRate = 155;
final double maxRate = 60.00;
Employee(int hoursWork, int employeeN){
this.hoursWork = hoursWork;
this.employeeN = employeeN;
}
public int gethoursWork(){
return hoursWork;
}
public int getemployeeN(){
return employeeN;
}
}
