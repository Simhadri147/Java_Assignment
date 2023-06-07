import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the interest rate (in percentage): ");
            double rate = scanner.nextDouble();

            System.out.print("Enter the time period (in years): ");
            double time = scanner.nextDouble();

            System.out.println("Select the type of interest:");
            System.out.println("1. Simple Interest");
            System.out.println("2. Compound Interest");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Exiting the program...");
                break;
            }

            double interest = 0.0;
            double totalAmount = 0.0;

            switch (choice) {
                case 1:
                    interest = calculateSimpleInterest(principal, rate, time);
                    totalAmount = principal + interest;
                    break;
                case 2:
                    interest = calculateCompoundInterest(principal, rate, time);
                    totalAmount = principal + interest;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.println("Interest: " + interest);
            System.out.println("Total Amount: " + totalAmount);
            System.out.println();

            System.out.print("Enter 4 to continue or 5 to discontinue: ");
            int continueChoice = scanner.nextInt();

            if (continueChoice == 5) {
                System.out.println("Exiting the program...");
                break;
            }
        }

        scanner.close();
    }

    private static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    private static double calculateCompoundInterest(double principal, double rate, double time) {
        double compoundInterest = principal;
        for (int i = 1; i <= time; i++) {
            compoundInterest = compoundInterest + (compoundInterest * rate / 100);
        }
        return compoundInterest - principal;
    }
}
