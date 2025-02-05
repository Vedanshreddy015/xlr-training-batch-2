import java.util.Scanner;

public class Demo058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Close the scanner
        scanner.close();

        System.out.println("Factors of " + number + " are:");

        // Calculate and print the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if i is a factor of number
                System.out.print(i + " ");
            }
        }
    }
}