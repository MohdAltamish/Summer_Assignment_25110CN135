// Write a program to Convert lowercase to uppercase.
import java.util.*;

public class Ques84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upper = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upper += (char) (ch - 32);
            } else {
                upper += ch;
            }
        }

        System.out.println("Uppercase string: " + upper);

        sc.close();
    }
}
