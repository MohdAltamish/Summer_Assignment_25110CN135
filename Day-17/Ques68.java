// Write a program to Find common elements.
import java.util.*;

public class Ques68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("Enter the size of third array: ");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        System.out.println("Enter " + n3 + " elements:");
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }

        System.out.println("Common elements in all three arrays:");
        boolean found = false;
        for (int i = 0; i < n1; i++) {
            boolean inSecond = false;
            boolean inThird = false;
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    inSecond = true;
                    break;
                }
            }
            for (int j = 0; j < n3; j++) {
                if (arr1[i] == arr3[j]) {
                    inThird = true;
                    break;
                }
            }
            if (inSecond && inThird) {
                System.out.print(arr1[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("No common elements found.");
        }
        System.out.println();

        sc.close();
    }
}
