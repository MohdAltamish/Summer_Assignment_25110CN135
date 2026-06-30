// Write a program to Develop complete mini project using arrays, strings and functions.
import java.util.*;

public class Ques120 {

    // Student data arrays
    static int maxStudents = 50;
    static String[] names = new String[maxStudents];
    static int[] rollNos = new int[maxStudents];
    static String[] courses = new String[maxStudents];
    static double[][] marks = new double[maxStudents][5];
    static String[] subjects = {"Mathematics", "Physics", "Chemistry", "English", "Computer Science"};
    static int studentCount = 0;

    // Add a new student
    public static void addStudent(Scanner sc) {
        if (studentCount >= maxStudents) {
            System.out.println("Maximum student limit reached.");
            return;
        }
        System.out.print("Enter Roll No: ");
        rollNos[studentCount] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        names[studentCount] = sc.nextLine();
        System.out.print("Enter Course: ");
        courses[studentCount] = sc.nextLine();
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("  " + subjects[i] + " (out of 100): ");
            marks[studentCount][i] = sc.nextDouble();
        }
        sc.nextLine();
        studentCount++;
        System.out.println("Student added successfully.");
    }

    // Calculate total marks
    public static double calculateTotal(int index) {
        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[index][i];
        }
        return total;
    }

    // Calculate percentage
    public static double calculatePercentage(int index) {
        return calculateTotal(index) / 5.0;
    }

    // Get grade
    public static String getGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B+";
        else if (percentage >= 60) return "B";
        else if (percentage >= 50) return "C";
        else if (percentage >= 40) return "D";
        else return "F";
    }

    // Display student details
    public static void displayStudent(int index) {
        double total = calculateTotal(index);
        double percentage = calculatePercentage(index);
        String grade = getGrade(percentage);

        System.out.println("========================================");
        System.out.println("  Roll No   : " + rollNos[index]);
        System.out.println("  Name      : " + names[index]);
        System.out.println("  Course    : " + courses[index]);
        System.out.println("  ---- Subject-wise Marks ----");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + subjects[i] + ": " + marks[index][i]);
        }
        System.out.println("  Total     : " + total + "/500");
        System.out.println("  Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("  Grade     : " + grade);
        System.out.println("========================================");
    }

    // Display all students
    public static void displayAll() {
        if (studentCount == 0) {
            System.out.println("No student records found.");
            return;
        }
        for (int i = 0; i < studentCount; i++) {
            displayStudent(i);
        }
    }

    // Search student by name
    public static void searchByName(Scanner sc) {
        System.out.print("Enter name to search: ");
        String search = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (names[i].toLowerCase().contains(search.toLowerCase())) {
                displayStudent(i);
                found = true;
            }
        }
        if (!found) System.out.println("Student not found.");
    }

    // Search student by roll no
    public static void searchByRoll(Scanner sc) {
        System.out.print("Enter Roll No to search: ");
        int roll = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < studentCount; i++) {
            if (rollNos[i] == roll) {
                displayStudent(i);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Update student marks
    public static void updateMarks(Scanner sc) {
        System.out.print("Enter Roll No to update: ");
        int roll = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < studentCount; i++) {
            if (rollNos[i] == roll) {
                System.out.println("Updating marks for " + names[i] + ":");
                for (int j = 0; j < 5; j++) {
                    System.out.print("  " + subjects[j] + " (current: " + marks[i][j] + "): ");
                    marks[i][j] = sc.nextDouble();
                }
                sc.nextLine();
                System.out.println("Marks updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Delete student
    public static void deleteStudent(Scanner sc) {
        System.out.print("Enter Roll No to delete: ");
        int roll = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < studentCount; i++) {
            if (rollNos[i] == roll) {
                System.out.println("Student " + names[i] + " deleted.");
                for (int j = i; j < studentCount - 1; j++) {
                    rollNos[j] = rollNos[j + 1];
                    names[j] = names[j + 1];
                    courses[j] = courses[j + 1];
                    marks[j] = marks[j + 1];
                }
                studentCount--;
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Display topper
    public static void displayTopper() {
        if (studentCount == 0) {
            System.out.println("No student records.");
            return;
        }
        int topperIdx = 0;
        double maxTotal = calculateTotal(0);
        for (int i = 1; i < studentCount; i++) {
            double total = calculateTotal(i);
            if (total > maxTotal) {
                maxTotal = total;
                topperIdx = i;
            }
        }
        System.out.println("=== TOPPER ===");
        displayStudent(topperIdx);
    }

    // Sort by percentage
    public static void sortByPercentage() {
        if (studentCount == 0) {
            System.out.println("No student records.");
            return;
        }
        // Bubble sort by percentage (descending)
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - 1 - i; j++) {
                if (calculatePercentage(j) < calculatePercentage(j + 1)) {
                    // Swap all data
                    int tempRoll = rollNos[j]; rollNos[j] = rollNos[j + 1]; rollNos[j + 1] = tempRoll;
                    String tempName = names[j]; names[j] = names[j + 1]; names[j + 1] = tempName;
                    String tempCourse = courses[j]; courses[j] = courses[j + 1]; courses[j + 1] = tempCourse;
                    double[] tempMarks = marks[j]; marks[j] = marks[j + 1]; marks[j + 1] = tempMarks;
                }
            }
        }
        System.out.println("Students sorted by percentage (highest first):");
        displayAll();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=============================================");
        System.out.println("   STUDENT MANAGEMENT SYSTEM - Mini Project  ");
        System.out.println("=============================================");

        do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1.  Add Student");
            System.out.println("2.  Display All Students");
            System.out.println("3.  Search by Name");
            System.out.println("4.  Search by Roll No");
            System.out.println("5.  Update Marks");
            System.out.println("6.  Delete Student");
            System.out.println("7.  Display Topper");
            System.out.println("8.  Sort by Percentage");
            System.out.println("9.  Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addStudent(sc); break;
                case 2: displayAll(); break;
                case 3: searchByName(sc); break;
                case 4: searchByRoll(sc); break;
                case 5: updateMarks(sc); break;
                case 6: deleteStudent(sc); break;
                case 7: displayTopper(); break;
                case 8: sortByPercentage(); break;
                case 9: System.out.println("Thank you for using the Student Management System!"); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 9);

        sc.close();
    }
}
