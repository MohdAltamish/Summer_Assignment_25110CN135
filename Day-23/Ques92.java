// Write a program to Find maximum occurring character.
import java.util.*;

public class Ques92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int maxCount = 0;
        char maxChar = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Maximum occurring character: '" + maxChar + "' with frequency: " + maxCount);

        sc.close();
    }
}
