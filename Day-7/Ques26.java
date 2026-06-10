// Write a program to Recursive Fibonacci. 

import java.util.*;

public class Ques26 {

    public static int fibonacci(int num) {
        if(num == 0){
            return 0;  
        }
        else if(num == 1){
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
}