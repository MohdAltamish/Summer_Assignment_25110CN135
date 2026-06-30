// Write a program to Remove duplicate characters.
import java.util.*;

public class Ques96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            for (int j = 0; j < result.length(); j++) {
                if (str.charAt(i) == result.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result += str.charAt(i);
            }
        }

        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}
