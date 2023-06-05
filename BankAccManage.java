import java.util.Scanner;

public class BankAccountManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        
        System.out.println("Welcome to the Bank Account Manager!");
        
        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Amount deposited successfully.");
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    boolean withdrawSuccess = account.withdraw(withdrawAmount);
                    if (withdrawSuccess) {
                        System.out.println("Amount withdrawn successfully.");
                    } else {
                        System.out.println("Insufficient balance. Withdrawal failed.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using Bank Account Manager. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
