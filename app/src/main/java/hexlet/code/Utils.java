package hexlet.code;

import java.util.Random;
public class Utils {
    private static Random rnd = new Random();

    public static int getRandomNumber(int begin, int end) {
        return rnd.nextInt(begin, end);
    }
    public static int getRandomNumber(int end) {
        return rnd.nextInt(0, end);
    }

}
