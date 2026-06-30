// Write a program to Reverse a number:

import java.util.Scanner;

public class Ques6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int rev = 0;
        int original = num;

        while (num != 0) {
            rev = rev *10 + num % 10;
            num /= 10;
        }
        System.out.println("The reverse of the number is: " + rev);

        sc.close();
    }
}
