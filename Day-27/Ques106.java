// Write a program to Create employee management system.
import java.util.*;

public class Ques106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxEmployees = 100;
        String[] names = new String[maxEmployees];
        int[] empIds = new int[maxEmployees];
        String[] departments = new String[maxEmployees];
        double[] salaries = new double[maxEmployees];
        int count = 0;
        int choice;

        System.out.println("=== Employee Management System ===");

        do {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < maxEmployees) {
                        System.out.print("Enter Employee ID: ");
                        empIds[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();
                        System.out.print("Enter Department: ");
                        departments[count] = sc.nextLine();
                        System.out.print("Enter Salary: ");
                        salaries[count] = sc.nextDouble();
                        count++;
                        System.out.println("Employee added successfully.");
                    } else {
                        System.out.println("Maximum limit reached.");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {
                        System.out.println("\n--- Employee Records ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID: " + empIds[i] + " | Name: " + names[i] + " | Dept: " + departments[i] + " | Salary: " + salaries[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (empIds[i] == searchId) {
                            System.out.println("ID: " + empIds[i] + " | Name: " + names[i] + " | Dept: " + departments[i] + " | Salary: " + salaries[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}
