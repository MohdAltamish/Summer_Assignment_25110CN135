// Write a program to Recursive reverse number. 

import java.util.*;

public class Ques28 {
    static int rev = 0;
    public static int reverse(int num) {
        if(num == 0){
            return rev;
        }
        rev = (rev * 10) + (num % 10);
        return reverse(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = reverse(num);
        System.out.println("The Reverse of a given number is: " + result);
        sc.close();
    }
}