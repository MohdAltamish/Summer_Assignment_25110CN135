// Write a program to Find string length without strlen().
import java.util.*;

public class Ques81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = 0;
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            length++;
        }

        System.out.println("Length of the string is: " + length);

        sc.close();
    }
}
