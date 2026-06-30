// Write a program to Create mini library system.
import java.util.*;

public class Ques118 {

    static String[] books = new String[50];
    static String[] authors = new String[50];
    static boolean[] available = new boolean[50];
    static String[] issuedTo = new String[50];
    static int bookCount = 0;

    public static void addBook(Scanner sc) {
        System.out.print("Enter Book Name: ");
        books[bookCount] = sc.nextLine();
        System.out.print("Enter Author Name: ");
        authors[bookCount] = sc.nextLine();
        available[bookCount] = true;
        bookCount++;
        System.out.println("Book added successfully.");
    }

    public static void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("\n--- Library Catalog ---");
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". " + books[i] + " by " + authors[i] + " [" + (available[i] ? "Available" : "Issued to: " + issuedTo[i]) + "]");
        }
    }

    public static void issueBook(Scanner sc) {
        System.out.print("Enter book number to issue: ");
        int idx = sc.nextInt() - 1;
        sc.nextLine();
        if (idx >= 0 && idx < bookCount) {
            if (available[idx]) {
                System.out.print("Enter borrower name: ");
                issuedTo[idx] = sc.nextLine();
                available[idx] = false;
                System.out.println("Book '" + books[idx] + "' issued to " + issuedTo[idx] + ".");
            } else {
                System.out.println("Book is already issued to " + issuedTo[idx] + ".");
            }
        } else {
            System.out.println("Invalid book number.");
        }
    }

    public static void returnBook(Scanner sc) {
        System.out.print("Enter book number to return: ");
        int idx = sc.nextInt() - 1;
        sc.nextLine();
        if (idx >= 0 && idx < bookCount) {
            if (!available[idx]) {
                System.out.println("Book '" + books[idx] + "' returned by " + issuedTo[idx] + ".");
                available[idx] = true;
                issuedTo[idx] = null;
            } else {
                System.out.println("Book is already available.");
            }
        } else {
            System.out.println("Invalid book number.");
        }
    }

    public static void searchBook(Scanner sc) {
        System.out.print("Enter book name to search: ");
        String search = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].toLowerCase().contains(search.toLowerCase())) {
                System.out.println((i + 1) + ". " + books[i] + " by " + authors[i] + " [" + (available[i] ? "Available" : "Issued") + "]");
                found = true;
            }
        }
        if (!found) System.out.println("No books found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=== Mini Library System ===");

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
                case 1: addBook(sc); break;
                case 2: displayBooks(); break;
                case 3: issueBook(sc); break;
                case 4: returnBook(sc); break;
                case 5: searchBook(sc); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}
