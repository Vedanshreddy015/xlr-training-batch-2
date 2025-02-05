import java.util.Scanner;

public class Demo056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Variable to store the sum of cubes
        int sumOfCubes = 0;

        // Calculate the sum of cubes of the digits
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sumOfCubes += digit * digit * digit; // Add the cube of the digit to the sum
            number /= 10; // Remove the last digit
        }

        // Display the result
        System.out.println("The sum of the cubes of the digits is: " + sumOfCubes);
    }
}