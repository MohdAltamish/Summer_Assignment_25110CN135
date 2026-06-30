// Write a program to Find nth Fibonacci term. 

import java.util.Scanner;

public class Ques14 {
    public static int fibonacci(int num){
        if(num <= 1){
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        System.out.print("The nth Fibonacci term is: ");
        System.out.println(fibonacci(n));
        

        sc.close();
    }
}