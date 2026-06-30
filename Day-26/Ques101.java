// Write a program to Create number guessing game.
import java.util.*;

public class Ques101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(100) + 1;
        int attempts = 0;
        boolean guessed = false;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("I have picked a number between 1 and 100. Try to guess it!");

        while (!guessed) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == secretNumber) {
                guessed = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        sc.close();
    }
}
