// Write a program to Check Armstrong number. 

import java.util.Scanner;

public class Ques16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number Range: ");
        int range = sc.nextInt();

        for (int num = 1; num <= range; num++) {

            int temp = num;
            int org = num;
            int sum = 0;
            int count = 0;

            boolean isarm = false;

            while (temp > 0) {
                temp /= 10;
                count++;
            }

            temp = num;

            while (temp > 0) {
                int rem = (temp % 10);
                sum += Math.pow(rem, count);
                temp /= 10;
            }

            if (sum == org) {
                isarm = true;
                System.out.println(num);

        }
            }
        }
    }