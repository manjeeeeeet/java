import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.println("\n--- Rock Paper Scissors ---");
           System.out.print("Your move: ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];

            System.out.println("computer choice:" + computerChoice);

            if (computerChoice.equals(playerChoice)) {
                System.out.println("It's a tie ><");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")
                    || playerChoice.equals("paper") && computerChoice.equals("rock")
                    || playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You Win!!!! <3");
            } else {
                System.out.println("Oops you lose T_T");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing ><");

        scanner.close();
    }

}
