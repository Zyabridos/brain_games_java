package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Round;
import hexlet.code.Utils;

public class Prime {
    public static boolean isPrime(int number) {
        if (number < 2) { return false; }
        for (int i = 2; i <= number / 2; i += 1) {
            if (number % i == 0) { return false; }
        }
        return true;
    }

    public static String getRules() {
        return "Answer \"yes\" if given number is prime. Otherwise answer \"no\".";
    }

    public static Round[] prepareRounds() {
        Round[] rounds = new Round[Engine.getRoundsCount()];
        for (int i = 0; i < rounds.length; i++) {
            int randomNumber = Utils.generateRandomNumber(100);
            String question = Integer.toString(randomNumber);
            String correctAnswer = (Prime.isPrime(randomNumber)) ? "yes" : "no";
            rounds[i] = new Round(question, correctAnswer);
        }
        return rounds;
    }
}
