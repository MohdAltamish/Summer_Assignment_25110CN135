// Write a program to Create inventory management system.
import java.util.*;

public class Ques116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxItems = 100;
        String[] itemNames = new String[maxItems];
        int[] itemIds = new int[maxItems];
        int[] quantities = new int[maxItems];
        double[] prices = new double[maxItems];
        int count = 0;
        int choice;

        System.out.println("=== Inventory Management System ===");

        do {
            System.out.println("\n1. Add Item");
            System.out.println("2. Display All Items");
            System.out.println("3. Search Item");
            System.out.println("4. Update Quantity");
            System.out.println("5. Remove Item");
            System.out.println("6. Total Inventory Value");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < maxItems) {
                        System.out.print("Enter Item ID: ");
                        itemIds[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Item Name: ");
                        itemNames[count] = sc.nextLine();
                        System.out.print("Enter Quantity: ");
                        quantities[count] = sc.nextInt();
                        System.out.print("Enter Price per unit: ");
                        prices[count] = sc.nextDouble();
                        count++;
                        System.out.println("Item added successfully.");
                    } else {
                        System.out.println("Inventory full.");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No items in inventory.");
                    } else {
                        System.out.println("\n--- Inventory ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID: " + itemIds[i] + " | Name: " + itemNames[i] + " | Qty: " + quantities[i] + " | Price: Rs. " + prices[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Item ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (itemIds[i] == searchId) {
                            System.out.println("ID: " + itemIds[i] + " | Name: " + itemNames[i] + " | Qty: " + quantities[i] + " | Price: Rs. " + prices[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Item not found.");
                    break;
                case 4:
                    System.out.print("Enter Item ID to update: ");
                    int updateId = sc.nextInt();
                    boolean updated = false;
                    for (int i = 0; i < count; i++) {
                        if (itemIds[i] == updateId) {
                            System.out.print("Enter new quantity: ");
                            quantities[i] = sc.nextInt();
                            System.out.println("Quantity updated.");
                            updated = true;
                            break;
                        }
                    }
                    if (!updated) System.out.println("Item not found.");
                    break;
                case 5:
                    System.out.print("Enter Item ID to remove: ");
                    int removeId = sc.nextInt();
                    boolean removed = false;
                    for (int i = 0; i < count; i++) {
                        if (itemIds[i] == removeId) {
                            for (int j = i; j < count - 1; j++) {
                                itemIds[j] = itemIds[j + 1];
                                itemNames[j] = itemNames[j + 1];
                                quantities[j] = quantities[j + 1];
                                prices[j] = prices[j + 1];
                            }
                            count--;
                            removed = true;
                            System.out.println("Item removed.");
                            break;
                        }
                    }
                    if (!removed) System.out.println("Item not found.");
                    break;
                case 6:
                    double totalValue = 0;
                    for (int i = 0; i < count; i++) {
                        totalValue += quantities[i] * prices[i];
                    }
                    System.out.println("Total Inventory Value: Rs. " + totalValue);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);

        sc.close();
    }
}
