// Write a program to Compress a string.
import java.util.*;

public class Ques94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String compressed = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed += str.charAt(i);
                if (count > 1) {
                    compressed += count;
                }
                count = 1;
            }
        }

        System.out.println("Compressed string: " + compressed);

        sc.close();
    }
}
