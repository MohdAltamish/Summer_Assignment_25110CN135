// Write a program to Find common characters in strings.
import java.util.*;

public class Ques98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String common = "";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            // Check if character exists in str2 and not already in common
            boolean inStr2 = false;
            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {
                    inStr2 = true;
                    break;
                }
            }
            boolean alreadyAdded = false;
            for (int j = 0; j < common.length(); j++) {
                if (ch == common.charAt(j)) {
                    alreadyAdded = true;
                    break;
                }
            }
            if (inStr2 && !alreadyAdded) {
                common += ch;
            }
        }

        if (common.length() > 0) {
            System.out.println("Common characters: " + common);
        } else {
            System.out.println("No common characters found.");
        }

        sc.close();
    }
}
