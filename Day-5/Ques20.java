// Write a program to Print factors of a number. 

import java.util.Scanner;

public class Ques20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int lprime = 1;
        boolean isprime;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isprime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isprime = false;
                        break;
                    }
                }
                if (isprime) {
                    lprime = i;
                }
            }
        }
        System.out.println("The largest prime factor is: " + lprime);

    }
}