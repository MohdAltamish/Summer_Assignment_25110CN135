// Write a program to Check whether a number is Prime or Not
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        boolean notprime = false;

        for (int i = 2; i < num - 1; i++) {
            if(num % i == 0){
                notprime = true;
                break;
            }
            
        }
        if(notprime){
            System.out.println("The number is not a prime number:");
        }
        else{
            System.out.println("The number is a prime number:");
        }

        sc.close();
    }
}