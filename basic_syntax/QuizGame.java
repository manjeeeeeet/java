import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        String[] questions = {
            "Which planet is known as the Red Planet?",
            "Who painted the Mona Lisa?",
            "What is the fastest land animal?",
            "Which programming language was created by James Gosling?",
            "What is the largest ocean on Earth?"
        };

        String[][] options = {
            {"1) Jupiter", "2) Venus", "3) Mars ", "4) Mercury"},
            {"1) Leonardo da Vinci", "2) Pablo Picasso", "3) Vincent van Gogh", "4) Michelangelo"},
            {"1) Lion", "2) Cheetah", "3) Horse", "4) Tiger"},
            {"1) Python", "2) Java", "3) C++", "4) JavaScript"},
            {"1) Arctic Ocean", "2) Atlantic Ocean", "3) Indian Ocean", "4) Pacific Ocean"}
        };

        int[] answers = {3, 1, 2, 2, 4};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("____________________________");

        for (int i = 0; i < questions.length; i++) {

            // Display question
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);

            // Display options
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Get user's answer
            System.out.print("Enter your answer (1-4): ");
            guess = scanner.nextInt();

            // Check answer
            if (guess == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        // Display final score
        System.out.println("\n____________________________");
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + "/" + questions.length);

        scanner.close();
    }
}
