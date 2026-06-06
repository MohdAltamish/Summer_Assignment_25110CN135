// Write a program to Find x^n without pow()

import java.util.*;

public class Ques4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base Number (x): ");
        int num = sc.nextInt();

        System.out.print("Enter Power (n): ");
        int pow = sc.nextInt();

        int mul = 1;

        for (int i = 1; i <= pow; i++) {
            mul *= num;
        }
        System.out.println("The Mulitply of Number is: " + mul);
        sc.close();
    }
}
