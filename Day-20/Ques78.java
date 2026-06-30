// Write a program to Check symmetric matrix.
import java.util.*;

public class Ques78 {
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

        boolean isSymmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != mat[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) break;
        }

        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }

        sc.close();
    }
}
