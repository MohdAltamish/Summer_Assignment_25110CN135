// Write a program to Create library management system.
import java.util.*;

public class Ques109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxBooks = 100;
        String[] bookNames = new String[maxBooks];
        String[] authors = new String[maxBooks];
        int[] bookIds = new int[maxBooks];
        boolean[] isIssued = new boolean[maxBooks];
        int count = 0;
        int choice;

        System.out.println("=== Library Management System ===");

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < maxBooks) {
                        System.out.print("Enter Book ID: ");
                        bookIds[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Book Name: ");
                        bookNames[count] = sc.nextLine();
                        System.out.print("Enter Author: ");
                        authors[count] = sc.nextLine();
                        isIssued[count] = false;
                        count++;
                        System.out.println("Book added successfully.");
                    } else {
                        System.out.println("Library is full.");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No books in library.");
                    } else {
                        System.out.println("\n--- Library Books ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID: " + bookIds[i] + " | " + bookNames[i] + " by " + authors[i] + " | Status: " + (isIssued[i] ? "Issued" : "Available"));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    boolean issueFound = false;
                    for (int i = 0; i < count; i++) {
                        if (bookIds[i] == issueId) {
                            if (!isIssued[i]) {
                                isIssued[i] = true;
                                System.out.println("Book '" + bookNames[i] + "' issued successfully.");
                            } else {
                                System.out.println("Book is already issued.");
                            }
                            issueFound = true;
                            break;
                        }
                    }
                    if (!issueFound) System.out.println("Book not found.");
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    boolean returnFound = false;
                    for (int i = 0; i < count; i++) {
                        if (bookIds[i] == returnId) {
                            if (isIssued[i]) {
                                isIssued[i] = false;
                                System.out.println("Book '" + bookNames[i] + "' returned successfully.");
                            } else {
                                System.out.println("Book was not issued.");
                            }
                            returnFound = true;
                            break;
                        }
                    }
                    if (!returnFound) System.out.println("Book not found.");
                    break;
                case 5:
                    System.out.print("Enter Book Name to search: ");
                    String searchName = sc.nextLine();
                    boolean searchFound = false;
                    for (int i = 0; i < count; i++) {
                        if (bookNames[i].equalsIgnoreCase(searchName)) {
                            System.out.println("ID: " + bookIds[i] + " | " + bookNames[i] + " by " + authors[i] + " | Status: " + (isIssued[i] ? "Issued" : "Available"));
                            searchFound = true;
                        }
                    }
                    if (!searchFound) System.out.println("Book not found.");
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
