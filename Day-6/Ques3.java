// Write a program to Convert binary to decimal

import java.util.*;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter a Number: ");
        int decimal = 0;
        int power = 0;
        while (num > 0) {
            int digit = num % 10;
            decimal += (digit * (int)Math.pow(2,power));
            power += 1;
            num /= 10;
        }
        sc.close();
        System.out.println("The decimal number is: " + decimal);
    }
}
