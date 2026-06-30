// Write a program to Write function to find factorial.
import java.util.*;

public class Ques44 {

    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long result = factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);

        sc.close();
    }
}
