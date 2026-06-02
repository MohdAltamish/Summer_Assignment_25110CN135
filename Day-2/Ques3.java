// Write a program to Find product of digits.

import java.util.Scanner;

public class Ques3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prd = 1;
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        while (num != 0) {
            prd *= num % 10;
            num /= 10;
        }
        System.out.println("The product of the digits of number is: " + prd);

        sc.close();
    }
}
