// Write a program to Create marksheet generation system.
import java.util.*;

public class Ques108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Marksheet Generation System ===");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] subjects = new String[n];
        int[] marks = new int[n];
        int totalMarks = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Subject " + (i + 1) + " name: ");
            subjects[i] = sc.nextLine();
            System.out.print("Enter marks (out of 100): ");
            marks[i] = sc.nextInt();
            sc.nextLine();
            totalMarks += marks[i];
        }

        double percentage = (double) totalMarks / (n * 100) * 100;

        String grade;
        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B+";
        else if (percentage >= 60) grade = "B";
        else if (percentage >= 50) grade = "C";
        else if (percentage >= 40) grade = "D";
        else grade = "F";

        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("-------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        System.out.println("-------------------------------");
        System.out.println("Total Marks: " + totalMarks + "/" + (n * 100));
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("===============================");

        sc.close();
    }
}
