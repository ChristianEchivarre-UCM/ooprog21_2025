import java.util.Scanner;

public class ForexExchangeSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};
        double[][] rates = new double[5][5]; 
        
        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- " + currencies[i] + " ---");
            for (int day = 0; day < 5; day++) {
                System.out.print("Day " + (day + 1) + " rate: ");
                rates[i][day] = sc.nextDouble();
            }
        }

        System.out.println("\n\n=== EXCHANGE RATE REPORT ===");

        
        for (int i = 0; i < 5; i++) {

            System.out.println("\n-------------------------------------");
            System.out.println("Currency: " + currencies[i]);
            System.out.println("-------------------------------------");

            double peak = rates[i][0];
            double low = rates[i][0];

            System.out.print("Rates: ");
            for (int day = 0; day < 5; day++) {
                System.out.print(rates[i][day] + "  ");

                if (rates[i][day] > peak)
                    peak = rates[i][day];

                if (rates[i][day] < low)
                    low = rates[i][day];
            }

            System.out.println("\nPeak Rate: " + peak);
            System.out.println("Lowest Rate: " + low);

             System.out.println("\nDaily Changes:");
            for (int day = 1; day < 5; day++) {
                if (rates[i][day] > rates[i][day - 1])
                    System.out.println("Day " + (day + 1) + ": Increase");
                else if (rates[i][day] < rates[i][day - 1])
                    System.out.println("Day " + (day + 1) + ": Decrease");
                else
                    System.out.println("Day " + (day + 1) + ": No Change");
            }
        }

        sc.close();
    }
}
