import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 101);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100: ");

        do{
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too low! ");
            }else if(guess > randomNumber){
                System.out.println("Too high! ");
            }

        } while(guess != randomNumber);

        System.out.printf("Congratulations! You guessed the number %d in %d attempts%n", randomNumber, attempts);



        scanner.close();
    }
}
