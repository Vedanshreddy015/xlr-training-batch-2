import java.util.Scanner;

public class Demo049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Variable to store the reversed number
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append it to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        // Display the result
        System.out.println("The reversed number is: " + reversedNumber);
    }
}