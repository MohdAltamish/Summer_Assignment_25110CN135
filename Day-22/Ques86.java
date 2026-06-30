// Write a program to Count words in a sentence.
import java.util.*;

public class Ques86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            int count = 1;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ') {
                    count++;
                }
            }
            System.out.println("Number of words: " + count);
        }

        sc.close();
    }
}
