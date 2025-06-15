package hexlet.code;

import hexlet.code.games.IsEven;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);

        String chosenGame = scanner.next();

        if (chosenGame.equals("0")) {
            return;
        }

        String userName = Cli.greet();

        if (chosenGame.equals("1")) {
            return; // приветствие уже выведено
        }

        if (chosenGame.equals("2")) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            for (int i = 0; i < 3; i++) {
                Round round = IsEven.generateRound();
                System.out.println("Question: " + round.question);
                String userAnswer = scanner.next();

                if (userAnswer.equals(round.correctAnswer)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + round.correctAnswer + "'.");
                    System.out.println("Let's try again, " + userName + "!");
                    return;
                }
            }
            System.out.println("Congratulations, " + userName + "!");
        }

        scanner.close();
    }
}
