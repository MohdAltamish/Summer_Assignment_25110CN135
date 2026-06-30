// Write a program to Find sum and average of array.
import java.util.*;

public class Ques50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / n;
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + avg);

        sc.close();
    }
}
