package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Round;
import hexlet.code.Utils;

public class Calc {
    private static final int MAX_RANDOM_NUMBER = 50;
    private static final int MIN_DIVISOR = 1;
    private static final int MAX_DIVISOR = 10;
    private static final int MIN_RESULT_FOR_DIVISION = 2;
    private static final int OPERATOR_COUNT = 3;

    public static String getRules() {
        return "What is the result of the expression?";
    }

    public static Round[] prepareRounds() {
        Round[] rounds = new Round[Engine.getRoundsCount()];

        for (int i = 0; i < rounds.length; i++) {
            String operator = generateOperator();
            int first;
            int second;

            if (operator.equals("/")) {
                do {
                    second = Utils.generateRandomNumber(MIN_DIVISOR, MAX_DIVISOR);
                    int result = Utils.generateRandomNumber(MIN_RESULT_FOR_DIVISION, MAX_DIVISOR);
                    first = result * second;
                } while (second == 0);
            } else {
                first = Utils.generateRandomNumber(0, MAX_RANDOM_NUMBER);
                second = Utils.generateRandomNumber(0, MAX_RANDOM_NUMBER);
            }

            String question = first + " " + operator + " " + second;
            int result = switch (operator) {
                case "+" -> first + second;
                case "-" -> first - second;
                case "*" -> first * second;
                case "/" -> first / second;
                default -> throw new IllegalStateException("Unexpected operator: " + operator);
            };

            rounds[i] = new Round(question, Integer.toString(result));
        }

        return rounds;
    }

    private static String generateOperator() {
        int n = Utils.generateRandomNumber(0, OPERATOR_COUNT - 1);
        return switch (n) {
            case 0 -> "+";
            case 1 -> "-";
            default -> "*";
        };
    }
}
