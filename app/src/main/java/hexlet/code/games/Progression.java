package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Round;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public class Progression {
    private static final int PROGRESSION_LENGTH = 10;
    private static final int MAX_START_VALUE = 20;
    private static final int MAX_STEP_VALUE = 10;
    private static final int MIN_STEP_VALUE = 1;

    public static String getRules() {
        return "What number is missing in the progression?";
    }

    private static List<Integer> generateProgression(int start, int step) {
        List<Integer> progression = new ArrayList<>();
        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            progression.add(start + i * step);
        }
        return progression;
    }

    public static Round[] prepareRounds() {
        Round[] rounds = new Round[Engine.getRoundsCount()];

        for (int i = 0; i < rounds.length; i++) {
            int start = Utils.generateRandomNumber(MAX_START_VALUE);
            int step = Utils.generateRandomNumber(MAX_STEP_VALUE) + MIN_STEP_VALUE;

            List<Integer> progression = generateProgression(start, step);

            int hiddenIndex = Utils.generateRandomNumber(PROGRESSION_LENGTH - 1);
            String correctAnswer = Integer.toString(progression.get(hiddenIndex));

            StringBuilder questionBuilder = new StringBuilder();
            for (int j = 0; j < PROGRESSION_LENGTH; j++) {
                if (j == hiddenIndex) {
                    questionBuilder.append(".. ");
                } else {
                    questionBuilder.append(progression.get(j)).append(" ");
                }
            }

            String question = questionBuilder.toString().trim();
            rounds[i] = new Round(question, correctAnswer);
        }

        return rounds;
    }
}
