// Write a program to Create student record system using arrays and strings.
import java.util.*;

public class Ques117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxStudents = 50;
        String[] names = new String[maxStudents];
        int[] rollNos = new int[maxStudents];
        String[] courses = new String[maxStudents];
        double[][] marks = new double[maxStudents][5];
        String[] subjects = {"Math", "Science", "English", "Hindi", "Computer"};
        int count = 0;
        int choice;

        System.out.println("=== Student Record System ===");

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by Name");
            System.out.println("4. Search by Roll No");
            System.out.println("5. Display Topper");
            System.out.println("6. Exit");
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
                        System.out.print("Enter Course: ");
                        courses[count] = sc.nextLine();
                        System.out.println("Enter marks for 5 subjects:");
                        for (int i = 0; i < 5; i++) {
                            System.out.print(subjects[i] + ": ");
                            marks[count][i] = sc.nextDouble();
                        }
                        sc.nextLine();
                        count++;
                        System.out.println("Student record added.");
                    } else {
                        System.out.println("Maximum limit reached.");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            double total = 0;
                            System.out.println("\n--- Student " + (i + 1) + " ---");
                            System.out.println("Roll No: " + rollNos[i] + " | Name: " + names[i] + " | Course: " + courses[i]);
                            for (int j = 0; j < 5; j++) {
                                System.out.println("  " + subjects[j] + ": " + marks[i][j]);
                                total += marks[i][j];
                            }
                            System.out.println("  Total: " + total + " | Percentage: " + String.format("%.2f", total / 5) + "%");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    boolean nameFound = false;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(searchName)) {
                            double total = 0;
                            System.out.println("Roll No: " + rollNos[i] + " | Name: " + names[i] + " | Course: " + courses[i]);
                            for (int j = 0; j < 5; j++) {
                                total += marks[i][j];
                            }
                            System.out.println("Total: " + total + " | Percentage: " + String.format("%.2f", total / 5) + "%");
                            nameFound = true;
                        }
                    }
                    if (!nameFound) System.out.println("Student not found.");
                    break;
                case 4:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    boolean rollFound = false;
                    for (int i = 0; i < count; i++) {
                        if (rollNos[i] == searchRoll) {
                            double total = 0;
                            System.out.println("Roll No: " + rollNos[i] + " | Name: " + names[i] + " | Course: " + courses[i]);
                            for (int j = 0; j < 5; j++) {
                                total += marks[i][j];
                            }
                            System.out.println("Total: " + total + " | Percentage: " + String.format("%.2f", total / 5) + "%");
                            rollFound = true;
                            break;
                        }
                    }
                    if (!rollFound) System.out.println("Student not found.");
                    break;
                case 5:
                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {
                        int topperIdx = 0;
                        double maxTotal = 0;
                        for (int i = 0; i < count; i++) {
                            double total = 0;
                            for (int j = 0; j < 5; j++) {
                                total += marks[i][j];
                            }
                            if (total > maxTotal) {
                                maxTotal = total;
                                topperIdx = i;
                            }
                        }
                        System.out.println("Topper: " + names[topperIdx] + " (Roll No: " + rollNos[topperIdx] + ") with " + maxTotal + " marks.");
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
