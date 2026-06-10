// Write a program to Check perfect number
import java.util.Scanner;

public class Ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int sum = 0;
        boolean isperfect = false;

        for (int i = 1; i <= num/2; i++) {
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num){
            isperfect = true;
        }

        if(isperfect){
            System.out.println("The number is a perfect number:");
        }
        else{
            System.out.println("The number is not a perfect number:");
        }

        sc.close();
    }
}