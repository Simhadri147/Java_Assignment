import java.util.Scanner;

public class DigitSum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int digitsum = CalculateDigitSum(number);
        
        System.out.println("The Digit sum of " + number + " is: " + digitsum);
        
        scanner.close();
    }
    
    private static int CalculateDigitSum(int number) {
        int sum = 0;
        
        while (number > 0){
            int digit = number % 10;
            sum = sum+digit;
            number = number/10;
        }
        
        if (sum > 9) {
            return CalculateDigitSum(sum);
        } else {
            return sum;
        }
    }
}
