// Write a program to Create menu-driven string operations system.
import java.util.*;

public class Ques115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int choice;

        System.out.println("=== Menu-Driven String Operations ===");

        do {
            System.out.println("\n1. Display String");
            System.out.println("2. String Length");
            System.out.println("3. Reverse String");
            System.out.println("4. Convert to Uppercase");
            System.out.println("5. Convert to Lowercase");
            System.out.println("6. Count Vowels");
            System.out.println("7. Check Palindrome");
            System.out.println("8. Replace Character");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Current string: " + str);
                    break;
                case 2:
                    System.out.println("String length: " + str.length());
                    break;
                case 3:
                    String reversed = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reversed += str.charAt(i);
                    }
                    str = reversed;
                    System.out.println("Reversed string: " + str);
                    break;
                case 4:
                    str = str.toUpperCase();
                    System.out.println("Uppercase: " + str);
                    break;
                case 5:
                    str = str.toLowerCase();
                    System.out.println("Lowercase: " + str);
                    break;
                case 6:
                    int vowelCount = 0;
                    for (int i = 0; i < str.length(); i++) {
                        char ch = Character.toLowerCase(str.charAt(i));
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                            vowelCount++;
                        }
                    }
                    System.out.println("Number of vowels: " + vowelCount);
                    break;
                case 7:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }
                    if (str.equalsIgnoreCase(rev)) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;
                case 8:
                    System.out.print("Enter character to replace: ");
                    char oldChar = sc.nextLine().charAt(0);
                    System.out.print("Enter replacement character: ");
                    char newChar = sc.nextLine().charAt(0);
                    str = str.replace(oldChar, newChar);
                    System.out.println("Updated string: " + str);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 9);

        sc.close();
    }
}
