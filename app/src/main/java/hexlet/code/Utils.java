package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();

    public static int generateRandomNumber(int max) {
        return RANDOM.nextInt(max + 1);
    }
}
