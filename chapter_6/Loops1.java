import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        final double FIXED_INTEREST = 0.03;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter initial bank balance: ");
        double balance = s.nextDouble();

        int year = 1;
        int choice;

        do {
            balance = balance + (balance * FIXED_INTEREST);
            System.out.printf("After year %d at 3%% interest, balance is $%.2f%n", year, balance);
            year++;

            System.out.println("Do you want to see next year's balance?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = s.nextInt();

        } while (choice == 1);
        System.out.println("Program ended. Final balance: $" + String.format("%.2f", balance));
    }
}
