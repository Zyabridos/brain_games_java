package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Round;
import hexlet.code.Utils;

public class GCD {
    private static final int MAX_RANDOM_NUMBER = 50;

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static Round[] prepareRounds() {
        Round[] rounds = new Round[Engine.getRoundsCount()];
        for (int i = 0; i < rounds.length; i++) {
            int firstNumber = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);
            int secondNumber = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);
            String question = Integer.toString(firstNumber) + " " + Integer.toString(secondNumber);
            int correctAnswer = GCD.findGCD(firstNumber, secondNumber);
            rounds[i] = new Round(question, Integer.toString(correctAnswer));
        }
        return rounds;
    }
}
