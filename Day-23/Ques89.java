// Write a program to Find first non-repeating character.
import java.util.*;

public class Ques89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = '\0';
        for (int i = 0; i < str.length(); i++) {
            boolean repeating = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    repeating = true;
                    break;
                }
            }
            if (!repeating) {
                result = str.charAt(i);
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
