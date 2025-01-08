import java.util.Scanner;

public class demo017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first digit: ");
        int firstDigit = scanner.nextInt();
        
        System.out.print("Enter the second digit: ");
        int secondDigit = scanner.nextInt();
        
        int sum = firstDigit + secondDigit;
        
        System.out.println("The sum of " + firstDigit + " and " + secondDigit + " is: " + sum);
        
        scanner.close();}
}