package hexlet.code;

public final class Round {
    private final String question;
    private final String correctAnswer;

    public Round(String questionText, String correctAnswerText) {
        this.question = questionText;
        this.correctAnswer = correctAnswerText;
    }

public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
