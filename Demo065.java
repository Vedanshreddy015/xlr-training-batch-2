import java.util.Scanner;

public class Demo065 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            if (size < 1) {
                System.out.println("The array must have at least 1 element.");
                return;
            }
            
            int[] array = new int[size];
            System.out.println("Enter " + size + " elements for the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("Array elements:");
            for (int element : array) {
                System.out.print(element + " ");
            }
        }
    }
}