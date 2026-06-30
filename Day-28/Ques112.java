// Write a program to Create contact management system.
import java.util.*;

public class Ques112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxContacts = 100;
        String[] names = new String[maxContacts];
        String[] phones = new String[maxContacts];
        String[] emails = new String[maxContacts];
        int count = 0;
        int choice;

        System.out.println("=== Contact Management System ===");

        do {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < maxContacts) {
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();
                        System.out.print("Enter Phone: ");
                        phones[count] = sc.nextLine();
                        System.out.print("Enter Email: ");
                        emails[count] = sc.nextLine();
                        count++;
                        System.out.println("Contact added successfully.");
                    } else {
                        System.out.println("Contact list is full.");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No contacts found.");
                    } else {
                        System.out.println("\n--- Contact List ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". Name: " + names[i] + " | Phone: " + phones[i] + " | Email: " + emails[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(searchName)) {
                            System.out.println("Name: " + names[i] + " | Phone: " + phones[i] + " | Email: " + emails[i]);
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Contact not found.");
                    break;
                case 4:
                    System.out.print("Enter name to delete: ");
                    String delName = sc.nextLine();
                    boolean deleted = false;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(delName)) {
                            for (int j = i; j < count - 1; j++) {
                                names[j] = names[j + 1];
                                phones[j] = phones[j + 1];
                                emails[j] = emails[j + 1];
                            }
                            count--;
                            deleted = true;
                            System.out.println("Contact deleted successfully.");
                            break;
                        }
                    }
                    if (!deleted) System.out.println("Contact not found.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
