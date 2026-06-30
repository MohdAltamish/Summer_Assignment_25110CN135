// Write a program to Create mini employee management system.
import java.util.*;

public class Ques119 {

    static String[] names = new String[50];
    static int[] empIds = new int[50];
    static String[] departments = new String[50];
    static double[] salaries = new double[50];
    static int count = 0;

    public static void addEmployee(Scanner sc) {
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
    }

    public static void displayEmployees() {
        if (count == 0) {
            System.out.println("No employees found.");
            return;
        }
        System.out.println("\n--- Employee Records ---");
        for (int i = 0; i < count; i++) {
            System.out.println("ID: " + empIds[i] + " | Name: " + names[i] + " | Dept: " + departments[i] + " | Salary: Rs. " + salaries[i]);
        }
    }

    public static void searchEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (empIds[i] == id) {
                System.out.println("ID: " + empIds[i] + " | Name: " + names[i] + " | Dept: " + departments[i] + " | Salary: Rs. " + salaries[i]);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void updateSalary(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (empIds[i] == id) {
                System.out.print("Enter new salary: ");
                salaries[i] = sc.nextDouble();
                System.out.println("Salary updated for " + names[i] + ".");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void deleteEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (empIds[i] == id) {
                System.out.println("Employee " + names[i] + " deleted.");
                for (int j = i; j < count - 1; j++) {
                    empIds[j] = empIds[j + 1];
                    names[j] = names[j + 1];
                    departments[j] = departments[j + 1];
                    salaries[j] = salaries[j + 1];
                }
                count--;
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void displayHighestPaid() {
        if (count == 0) {
            System.out.println("No employees found.");
            return;
        }
        int maxIdx = 0;
        for (int i = 1; i < count; i++) {
            if (salaries[i] > salaries[maxIdx]) {
                maxIdx = i;
            }
        }
        System.out.println("Highest Paid: " + names[maxIdx] + " (ID: " + empIds[maxIdx] + ") - Rs. " + salaries[maxIdx]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=== Mini Employee Management System ===");

        do {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Highest Paid Employee");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addEmployee(sc); break;
                case 2: displayEmployees(); break;
                case 3: searchEmployee(sc); break;
                case 4: updateSalary(sc); break;
                case 5: deleteEmployee(sc); break;
                case 6: displayHighestPaid(); break;
                case 7: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 7);

        sc.close();
    }
}
