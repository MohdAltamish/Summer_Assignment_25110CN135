// Write a program to Convert decimal to binary. 
import java.util.*;

public class Ques22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter a Number: ");
        int binary = 0;
        int place = 1;
        while (num > 0) {
            int rem = num % 2;
            binary += rem * place;
            place *= 10;
            num /= 2;
        }
        sc.close();
        System.out.println("The binary number is: " + binary);
    }
}
