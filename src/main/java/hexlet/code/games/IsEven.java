package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Round;

public class IsEven {
    public static boolean checkIsEven(int number) {
        return number % 2 == 0;
    }

    public static Round generateRound() {
        int number = Utils.generateRandomNumber();
        String question = Integer.toString(number);
        String correctAnswer = checkIsEven(number) ? "yes" : "no";
        return new Round(question, correctAnswer);
    }
}
