// Write a program to Find sum of digits of a:

import java.util.Scanner;

public class Ques5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of the digits of number is: " + sum);

        sc.close();
    }
}
