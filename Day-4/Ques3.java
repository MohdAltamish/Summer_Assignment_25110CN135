// Write a program to Check Armstrong number. 

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int temp = num;
        int org = num;
        int sum = 0;
        int count = 0;
        
        while(temp > 0){
            temp /= 10;
            count++;
        }
        temp = num;
        while(temp > 0){
            int rem = (temp % 10);
            sum += Math.pow(rem, count);
            temp /= 10;
        }

        if(sum == org){
            System.out.println("The number is a Armstrong Number");
        }
        else{
            System.out.println("The number is not a Armstrong Number");
        }
    }
}