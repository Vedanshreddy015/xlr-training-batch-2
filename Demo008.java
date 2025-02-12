import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
       
        final String USERNAME = "admin";
        final String PASSWORD = "password123";

        try (Scanner scanner = new Scanner(System.in)) {
            String inputUsername;
            String inputPassword;
            boolean loginSuccessful = false;
            
            System.out.println("=== Login Page ===");
            
            
            do {
                System.out.print("Enter username: ");
                inputUsername = scanner.nextLine();
                
                System.out.print("Enter password: ");
                inputPassword = scanner.nextLine();
                
                if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
                    loginSuccessful = true;
                    System.out.println("Login successful! Welcome, " + USERNAME + "!");
                } else {
                    System.out.println("Invalid credentials. Please try again.");
                }
            } while (!loginSuccessful);
        }
    }
}
