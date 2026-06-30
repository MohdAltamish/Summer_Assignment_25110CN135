// Write a program to Create quiz application.
import java.util.*;

public class Ques104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "What is the capital of India?",
            "Which planet is known as the Red Planet?",
            "What is the largest ocean on Earth?",
            "Who wrote Romeo and Juliet?",
            "What is the square root of 144?"
        };

        String[][] options = {
            {"a) Mumbai", "b) New Delhi", "c) Kolkata", "d) Chennai"},
            {"a) Venus", "b) Jupiter", "c) Mars", "d) Saturn"},
            {"a) Atlantic", "b) Indian", "c) Arctic", "d) Pacific"},
            {"a) Charles Dickens", "b) William Shakespeare", "c) Mark Twain", "d) Jane Austen"},
            {"a) 10", "b) 11", "c) 12", "d) 14"}
        };

        char[] answers = {'b', 'c', 'd', 'b', 'c'};

        int score = 0;

        System.out.println("=== Quiz Application ===");
        System.out.println("Answer the following questions:\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println("   " + options[i][j]);
            }
            System.out.print("Your answer (a/b/c/d): ");
            char answer = sc.nextLine().charAt(0);

            if (answer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + answers[i] + "\n");
            }
        }

        System.out.println("=== Quiz Results ===");
        System.out.println("Score: " + score + "/" + questions.length);
        System.out.println("Percentage: " + (score * 100 / questions.length) + "%");

        sc.close();
    }
}
