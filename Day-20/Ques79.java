// Write a program to Find row-wise sum.
import java.util.*;

public class Ques79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Row-wise sum:");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += mat[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sum);
        }

        sc.close();
    }
}
