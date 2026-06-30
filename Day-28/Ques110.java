// Write a program to Create bank account system.
import java.util.*;

public class Ques110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxAccounts = 100;
        String[] names = new String[maxAccounts];
        int[] accountNos = new int[maxAccounts];
        double[] balances = new double[maxAccounts];
        int count = 0;
        int choice;

        System.out.println("=== Bank Account System ===");

        do {
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < maxAccounts) {
                        System.out.print("Enter Account Number: ");
                        accountNos[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();
                        System.out.print("Enter Initial Deposit: ");
                        balances[count] = sc.nextDouble();
                        count++;
                        System.out.println("Account created successfully.");
                    } else {
                        System.out.println("Maximum accounts reached.");
                    }
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    int depAcc = sc.nextInt();
                    boolean depFound = false;
                    for (int i = 0; i < count; i++) {
                        if (accountNos[i] == depAcc) {
                            System.out.print("Enter amount to deposit: ");
                            double depAmt = sc.nextDouble();
                            balances[i] += depAmt;
                            System.out.println("Rs. " + depAmt + " deposited. New Balance: Rs. " + balances[i]);
                            depFound = true;
                            break;
                        }
                    }
                    if (!depFound) System.out.println("Account not found.");
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    int wdAcc = sc.nextInt();
                    boolean wdFound = false;
                    for (int i = 0; i < count; i++) {
                        if (accountNos[i] == wdAcc) {
                            System.out.print("Enter amount to withdraw: ");
                            double wdAmt = sc.nextDouble();
                            if (wdAmt <= balances[i]) {
                                balances[i] -= wdAmt;
                                System.out.println("Rs. " + wdAmt + " withdrawn. New Balance: Rs. " + balances[i]);
                            } else {
                                System.out.println("Insufficient balance.");
                            }
                            wdFound = true;
                            break;
                        }
                    }
                    if (!wdFound) System.out.println("Account not found.");
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    int balAcc = sc.nextInt();
                    boolean balFound = false;
                    for (int i = 0; i < count; i++) {
                        if (accountNos[i] == balAcc) {
                            System.out.println("Account: " + names[i] + " | Balance: Rs. " + balances[i]);
                            balFound = true;
                            break;
                        }
                    }
                    if (!balFound) System.out.println("Account not found.");
                    break;
                case 5:
                    if (count == 0) {
                        System.out.println("No accounts found.");
                    } else {
                        System.out.println("\n--- All Accounts ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Acc No: " + accountNos[i] + " | Name: " + names[i] + " | Balance: Rs. " + balances[i]);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}
