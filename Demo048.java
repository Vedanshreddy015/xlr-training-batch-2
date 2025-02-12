import java.util.Scanner;

public class Demo048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate the sum of digits
        int sum = 0;
        int temp = number; // Store the original number for display purposes

        while (temp > 0) {
            sum += temp % 10; // Add the last digit to sum
            temp /= 10;       // Remove the last digit
        }

        // Display the result
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
}