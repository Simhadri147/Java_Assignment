import java.util.Scanner;

public class UserRegistration {
    private String username;
    private String password;
    private String email;

    public UserRegistration(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void displayUserInfo() {
        System.out.println("User Info:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("User Registration");
        System.out.println("------------------");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Password validation
        String password = "";
        boolean validPassword = false;
        while (!validPassword) {
            System.out.print("Enter password (at least 8 characters): ");
            password = scanner.nextLine();
            if (password.length() >= 8) {
                validPassword = true;
            } else {
                System.out.println("Invalid password. Please enter at least 8 characters.");
            }
        }

        // Email validation
        String email = "";
        boolean validEmail = false;
        while (!validEmail) {
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            if (email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
                validEmail = true;
            } else {
                System.out.println("Invalid email. Please enter a valid email address.");
            }
        }

        UserRegistration user = new UserRegistration(username, password, email);
        user.displayUserInfo();

        scanner.close();
    }
}
