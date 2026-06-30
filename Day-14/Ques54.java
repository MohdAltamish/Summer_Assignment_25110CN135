// Write a program to Frequency of an element.
import java.util.*;

public class Ques54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to find frequency: ");
        int key = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Frequency of " + key + " is: " + count);

        sc.close();
    }
}
