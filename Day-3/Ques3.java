// Write a program to Find GCD of two numbers.

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Two Number: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        while(B != 0){
            int temp = B;
            B = A % B;
            A = temp;
        }
        System.out.println("The Greatest Comman Divisior is: " + A);
    }
}