// Write a program to Print repeated character pattern.

import java.util.*;

public class Ques35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + i - 1);

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}