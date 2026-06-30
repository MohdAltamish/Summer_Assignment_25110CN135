// Write a program to Create menu-driven calculator.
import java.util.*;

public class Ques113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=== Menu-Driven Calculator ===");

        do {
            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Result: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Result: " + (a * b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Result: " + (a / b));
                        } else {
                            System.out.println("Error: Division by zero.");
                        }
                        break;
                    case 5:
                        if (b != 0) {
                            System.out.println("Result: " + (a % b));
                        } else {
                            System.out.println("Error: Division by zero.");
                        }
                        break;
                    case 6:
                        System.out.println("Result: " + Math.pow(a, b));
                        break;
                }
            } else if (choice == 7) {
                System.out.println("Exiting calculator...");
            } else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 7);

        sc.close();
    }
}
