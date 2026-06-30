// Write a program to Print prime numbers in a range.

import java.util.Scanner;

public class Ques10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Range: ");
        int num = sc.nextInt();

        System.out.print("Prime numbers are: ");

        for (int i = 2; i <= num; i++) {
            boolean isprime = true;
            
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            
            if(isprime){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}