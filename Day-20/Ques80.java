// Write a program to Find column-wise sum.
import java.util.*;

public class Ques80 {
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

        System.out.println("Column-wise sum:");
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += mat[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + sum);
        }

        sc.close();
    }
}
