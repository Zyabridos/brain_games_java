package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Round;
import hexlet.code.Utils;

public class Prime {
    private static final int MIN_PRIME_CANDIDATE = 2;
    private static final int MAX_RANDOM_NUMBER = 100;

    public static boolean isPrime(int number) {
        if (number < MIN_PRIME_CANDIDATE) {
            return false;
        }
        for (int i = MIN_PRIME_CANDIDATE; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static Round[] prepareRounds() {
        Round[] rounds = new Round[Engine.getRoundsCount()];
        for (int i = 0; i < rounds.length; i++) {
            int randomNumber = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);
            String question = Integer.toString(randomNumber);
            String correctAnswer = isPrime(randomNumber) ? "yes" : "no";
            rounds[i] = new Round(question, correctAnswer);
        }
        return rounds;
    }
}
