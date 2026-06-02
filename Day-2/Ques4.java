// Write a program to Check whether a number is palindrome.
import java.util.Scanner;

public class Ques4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int rev = 0;
        int original = num;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        if (original == rev) {
            System.out.println("The number is a palinrome: ");
        } else {
            System.out.println("The number is not a palinrome: ");

        }

        sc.close();
    }
}
