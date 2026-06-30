// Write a program to Create student record management system.
import java.util.*;

public class Ques105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxStudents = 100;
        String[] names = new String[maxStudents];
        int[] rollNos = new int[maxStudents];
        double[] marks = new double[maxStudents];
        int count = 0;
        int choice;

        System.out.println("=== Student Record Management System ===");

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < maxStudents) {
                        System.out.print("Enter Roll No: ");
                        rollNos[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        marks[count] = sc.nextDouble();
                        count++;
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Maximum limit reached.");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {
                        System.out.println("\n--- Student Records ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Roll No: " + rollNos[i] + " | Name: " + names[i] + " | Marks: " + marks[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (rollNos[i] == searchRoll) {
                            System.out.println("Roll No: " + rollNos[i] + " | Name: " + names[i] + " | Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
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
