package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_COUNT = 3;

    public static void run(String gameRules, Round[] rounds, String userName) {
        System.out.println(gameRules);
        Scanner scanner = new Scanner(System.in);

        for (Round round : rounds) {
            System.out.println("Question: " + round.getQuestion());
            String userAnswer = scanner.next();

            if (userAnswer.equals(round.getCorrectAnswer())) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + round.getCorrectAnswer() + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    public static int getRoundsCount() {
        return ROUNDS_COUNT;
    }
}
