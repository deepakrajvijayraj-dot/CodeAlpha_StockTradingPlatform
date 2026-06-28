import java.util.Scanner;
public class StockTradingPlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        String[] stockNames = {
                "TCS",
                "Infosys",
                "Reliance",
                "HDFC Bank",
                "Wipro"
        };
        double[] stockPrices = {
                3500,
                1600,
                2800,
                1700,
                280
        };
        int choice;
        while (true) {
            System.out.println("\n==================================");
            System.out.println("     STOCK TRADING PLATFORM");
            System.out.println("==================================");
            System.out.println("1. View Available Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n------ Available Stocks ------");
                    for (int i = 0; i < stockNames.length; i++) {
                        System.out.println((i + 1) + ". " +
                                stockNames[i] +
                                " - Rs." +
                                (int) stockPrices[i]);
                    }
                    break;
                case 2:
                    System.out.println("\nBuy Stock - Coming Soon...");
                    break;
                case 3:
                    System.out.println("\nSell Stock - Coming Soon...");
                    break;
                case 4:
                    System.out.println("\nPortfolio - Coming Soon...");
                    break;
                case 5:
                    System.out.println("\nCurrent Balance : Rs." + (int) balance);
                    break;
                case 6:
                    System.out.println("\nThank you for using Stock Trading Platform!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid Choice! Please try again.");
            }
        }
    }
}