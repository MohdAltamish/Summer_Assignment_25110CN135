// Write a program to Find diagonal sum.
import java.util.*;

public class Ques76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of square matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;
        for (int i = 0; i < n; i++) {
            primarySum += mat[i][i];
            secondarySum += mat[i][n - 1 - i];
        }

        System.out.println("Primary diagonal sum: " + primarySum);
        System.out.println("Secondary diagonal sum: " + secondarySum);

        sc.close();
    }
}
