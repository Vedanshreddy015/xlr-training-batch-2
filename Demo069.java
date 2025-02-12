import java.util.Scanner;

public class Demo069{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for ( int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            }
            int sum = 0;
            for ( int num : arr) {
                sum += num;
            }
            System.out.println("Sum of all elements in the array: +sum");
            sc.close();
    }
}