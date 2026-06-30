// Write a program to Create menu-driven array operations system.
import java.util.*;

public class Ques114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n * 2]; // Extra space for insertion
        int size = n;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        System.out.println("=== Menu-Driven Array Operations ===");

        do {
            System.out.println("\n1. Display Array");
            System.out.println("2. Insert Element");
            System.out.println("3. Delete Element");
            System.out.println("4. Search Element");
            System.out.println("5. Sort Array");
            System.out.println("6. Reverse Array");
            System.out.println("7. Find Max and Min");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Array elements:");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter element to insert: ");
                    int elem = sc.nextInt();
                    System.out.print("Enter position (0 to " + size + "): ");
                    int pos = sc.nextInt();
                    if (pos >= 0 && pos <= size) {
                        for (int i = size; i > pos; i--) {
                            arr[i] = arr[i - 1];
                        }
                        arr[pos] = elem;
                        size++;
                        System.out.println("Element inserted.");
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;
                case 3:
                    System.out.print("Enter element to delete: ");
                    int delElem = sc.nextInt();
                    boolean delFound = false;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == delElem) {
                            for (int j = i; j < size - 1; j++) {
                                arr[j] = arr[j + 1];
                            }
                            size--;
                            delFound = true;
                            System.out.println("Element deleted.");
                            break;
                        }
                    }
                    if (!delFound) System.out.println("Element not found.");
                    break;
                case 4:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean searchFound = false;
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at index: " + i);
                            searchFound = true;
                            break;
                        }
                    }
                    if (!searchFound) System.out.println("Element not found.");
                    break;
                case 5:
                    for (int i = 0; i < size - 1; i++) {
                        for (int j = 0; j < size - 1 - i; j++) {
                            if (arr[j] > arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Array sorted.");
                    break;
                case 6:
                    for (int i = 0; i < size / 2; i++) {
                        int temp = arr[i];
                        arr[i] = arr[size - 1 - i];
                        arr[size - 1 - i] = temp;
                    }
                    System.out.println("Array reversed.");
                    break;
                case 7:
                    int max = arr[0], min = arr[0];
                    for (int i = 1; i < size; i++) {
                        if (arr[i] > max) max = arr[i];
                        if (arr[i] < min) min = arr[i];
                    }
                    System.out.println("Maximum: " + max);
                    System.out.println("Minimum: " + min);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 8);

        sc.close();
    }
}
