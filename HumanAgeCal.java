import java.util.Scanner;

public class HumanAgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age in years: ");
        int ageInYears = scanner.nextInt();

        // Calculate the age in months, days, and hours
        int ageInMonths = ageInYears * 12;
        int ageInDays = ageInYears * 365;
        int ageInHours = ageInDays * 24;

        // Display the calculated age
        System.out.println("\n***** HUMAN AGE CALCULATOR *****");
        System.out.println("Age in Years: " + ageInYears);
        System.out.println("Age in Months: " + ageInMonths);
        System.out.println("Age in Days: " + ageInDays);
        System.out.println("Age in Hours: " + ageInHours);
        System.out.println("********************************");

        scanner.close();
    }
}
