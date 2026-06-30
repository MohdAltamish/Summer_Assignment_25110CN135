// Write a program to Create voting eligibility system.
import java.util.*;

public class Ques102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Voting Eligibility System ===");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your nationality: ");
        String nationality = sc.nextLine();

        System.out.println("\n--- Eligibility Result ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);

        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("Status: You are eligible to vote.");
        } else if (age < 18) {
            System.out.println("Status: You are not eligible to vote. Minimum age is 18.");
        } else {
            System.out.println("Status: You are not eligible to vote in Indian elections.");
        }

        sc.close();
    }
}
