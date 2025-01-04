import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

    
        System.out.print("Enter your phone number: ");
        long phoneNo = scanner.nextLong();

       
       
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNo);
        
      
        scanner.close();
    }
}
