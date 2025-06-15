package hexlet.code.games;

import hexlet.code.Round;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class Calc {
    public static String getRules() {
        return "What is the result of the expression?";
    }

    public static Round[] prepareRounds() {
        Round[] rounds = new Round[Engine.getRoundsCount()];
        for (int i = 0; i < rounds.length; i++) {
            int first = Utils.generateRandomNumber(50);
            int second = Utils.generateRandomNumber(50);
            String operator = generateOperator();

            String question = first + " " + operator + " " + second;
            int result;

            switch (operator) {
                case "+" -> result = first + second;
                case "-" -> result = first - second;
                case "*" -> result = first * second;
                case "/" -> result = first / second;
                default -> throw new IllegalStateException("Unexpected operator: " + operator);
            }

            rounds[i] = new Round(question, Integer.toString(result));
        }
        return rounds;
    }

    private static String generateOperator() {
        int n = Utils.generateRandomNumber(3); // 0–3
        return switch (n) {
            case 0 -> "+";
            case 1 -> "-";
            case 2 -> "*";
            default -> "/";
        };
    }
}
