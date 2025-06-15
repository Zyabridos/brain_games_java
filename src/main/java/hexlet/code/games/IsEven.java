package hexlet.code.games;

import hexlet.code.Round;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class IsEven {
    public static String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static Round[] prepareRounds() {
        Round[] rounds = new Round[Engine.getRoundsCount()];
        for (int i = 0; i < rounds.length; i++) {
            int number = Utils.generateRandomNumber(50);
            String question = Integer.toString(number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            rounds[i] = new Round(question, correctAnswer);
        }
        return rounds;
    }
}
