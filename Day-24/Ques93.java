// Write a program to Check string rotation.
import java.util.*;

public class Ques93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not rotations of each other.");
        } else {
            String concat = str1 + str1;
            if (concat.contains(str2)) {
                System.out.println("The strings are rotations of each other.");
            } else {
                System.out.println("The strings are not rotations of each other.");
            }
        }

        sc.close();
    }
}
