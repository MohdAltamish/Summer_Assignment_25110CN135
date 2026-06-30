// Write a program to Write function to find maximum.
import java.util.*;

public class Ques42 {

    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = findMax(a, b);
        System.out.println("The maximum of two numbers is: " + result);

        sc.close();
    }
}
