// Write a program to Recursive sum of digits. 

import java.util.*;

public class Ques27 {

    public static int sof(int num) {
        if(num == 0){
            return 0;
        }
        return (num % 10) + sof(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = sof(num);
        System.out.println("The Sum of digit of a given number is: " + result);
        sc.close();
    }
}