package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Round;
import hexlet.code.Utils;

public class Calc {
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
                    second = Utils.generateRandomNumber(1, 10); // не 0
                    int result = Utils.generateRandomNumber(2, 10);
                    first = result * second; // гарантирует целое деление
                } while (second == 0);
            } else {
                first = Utils.generateRandomNumber(0, 50);
                second = Utils.generateRandomNumber(0, 50);
            }

            String question = first + " " + operator + " " + second;
            int result;

            switch (operator) {
                case "+" -> result = first + second;
                case "-" -> result = first - second;
                case "*" -> result = first * second;
                case "/" -> result = first / second;
                default -> throw new IllegalStateException("Unexpected operator: " + operator);
            }

            String correctAnswer = Integer.toString(result);
            rounds[i] = new Round(question, correctAnswer);
        }

        return rounds;
    }

    private static String generateOperator() {
        int n = Utils.generateRandomNumber(0, 3); // 0–3
        return switch (n) {
            case 0 -> "+";
            case 1 -> "-";
            case 2 -> "*";
            default -> "/";
        };
    }
}
