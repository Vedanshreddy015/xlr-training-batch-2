import java.util.Scanner;

public class Demo057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Find the last digit
        int lastDigit = number % 10;

        // Find the first digit
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10; // Remove the last digit until only the first digit remains
        }

        // Calculate the sum of the first and last digits
        int sum = firstDigit + lastDigit;

        // Display the result
        System.out.println("The sum of the first and last digits is: " + sum);
    }
}