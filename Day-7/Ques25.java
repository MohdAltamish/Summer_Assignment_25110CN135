// Write a program to Recursive factorial. 

import java.util.*;

public class Ques25 {

    public static int factorial(int num) {
        if(num == 0 || num == 1){
            return 1;  
        }
        return num * factorial(num - 1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = factorial(num);

        System.out.print("The factorial of a given number is: " + result);
        sc.close();
    }
}