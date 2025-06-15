package hexlet.code;

public class Utils {
    public static int generateRandomNumber() {
        double randomNumber = Math.random();
        return (int) Math.round(randomNumber * 100.0);
    }
}
