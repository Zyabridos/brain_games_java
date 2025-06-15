package hexlet.code;

public class Utils {
    public static int generateRandomNumber(int max) {
        double randomNumber = Math.random();
        return (int) Math.round(randomNumber * max);
    }
}
