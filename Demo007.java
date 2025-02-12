import java.util.Scanner;

public class Demo007 {
    public static void main(String[] args) {
      
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            
            System.out.print("Enter your phone number: ");
            long phoneNo = scanner.nextLong();
            
            
            
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Phone Number: " + phoneNo);
        }
    }
}
