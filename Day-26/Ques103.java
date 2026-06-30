// Write a program to Create ATM simulation.
import java.util.*;

public class Ques103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 10000.0;
        int choice;

        System.out.println("=== ATM Simulation ===");

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: Rs. " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: Rs. ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Rs. " + deposit + " deposited successfully.");
                        System.out.println("New balance: Rs. " + balance);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: Rs. ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Rs. " + withdraw + " withdrawn successfully.");
                        System.out.println("New balance: Rs. " + balance);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
