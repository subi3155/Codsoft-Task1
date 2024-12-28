import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1; // Generate a number between 1 and 100
            int attempts = 0;
            int maxAttempts = 10; // Set maximum attempts
            boolean guessedCorrectly = false;

            System.out.println("Guess the number (between 1 and 100):");

            while (attempts < maxAttempts) {
                attempts++;
                System.out.print("Attempt " + attempts + ": ");
                int userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
