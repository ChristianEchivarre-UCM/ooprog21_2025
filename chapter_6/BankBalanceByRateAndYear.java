import java.util.Scanner;

public class BankBalanceByRateAndYear {

    public static void main(String[] args) {
    final double FIXED_INTEREST = 0.02;
    final double FIXED_INTEREST2 = 0.03;
    final double FIXED_INTEREST3 = 0.04; 
    final double FIXED_INTEREST4 = 0.05;
        Scanner b = new Scanner(System.in);
        System.out.print("Enter initial bank balance >>> ");
        double balance = b.nextDouble();
         double balance1 = balance;
System.out.printf("\nWith an initial balance of %.2f at an interest of %.2f ", balance1, FIXED_INTEREST);
            for (int year = 1; year <= 4; year++) {
balance = balance + (balance * FIXED_INTEREST);
System.out.printf("After year %d, balance is %.2f%n", year, balance);
}
System.out.println();
balance = balance1;
System.out.printf("\nWith an initial balance of %.2f at an interest of %.2f ", balance1, FIXED_INTEREST2);
for (int year = 1; year <= 4; year++) {
balance = balance + (balance * FIXED_INTEREST2);
System.out.printf("After year %d, balance is %.2f%n", year, balance);
}
System.out.println();
balance = balance1;
System.out.printf("\nWith an initial balance of %.2f at an interest of %.2f ", balance1, FIXED_INTEREST3);
for (int year = 1; year <= 4; year++) {
balance = balance + (balance * FIXED_INTEREST3);
System.out.printf("After year %d, balance is %.2f%n", year, balance);
}
System.out.println();
balance = balance1;
System.out.printf("\nWith an initial balance of %.2f at an interest of %.2f ", balance1, FIXED_INTEREST4);
for (int year = 1; year <= 4; year++) {
balance = balance + (balance * FIXED_INTEREST4);
System.out.printf("After year %d, balance is %.2f%n", year, balance);
}
}
}
