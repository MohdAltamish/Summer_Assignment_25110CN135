// Write a program to Create salary management system.
import java.util.*;

public class Ques107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Salary Management System ===");

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        double[] basicSalaries = new double[n];
        double[] hra = new double[n];
        double[] da = new double[n];
        double[] deductions = new double[n];
        double[] netSalaries = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Employee " + (i + 1) + " ---");
            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();
            System.out.print("Enter Basic Salary: ");
            basicSalaries[i] = sc.nextDouble();
            sc.nextLine();

            hra[i] = basicSalaries[i] * 0.20;     // 20% HRA
            da[i] = basicSalaries[i] * 0.15;      // 15% DA
            deductions[i] = basicSalaries[i] * 0.10; // 10% Deductions
            netSalaries[i] = basicSalaries[i] + hra[i] + da[i] - deductions[i];
        }

        System.out.println("\n=== Salary Report ===");
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee: " + names[i]);
            System.out.println("Basic Salary: Rs. " + basicSalaries[i]);
            System.out.println("HRA (20%): Rs. " + hra[i]);
            System.out.println("DA (15%): Rs. " + da[i]);
            System.out.println("Deductions (10%): Rs. " + deductions[i]);
            System.out.println("Net Salary: Rs. " + netSalaries[i]);
        }

        sc.close();
    }
}
