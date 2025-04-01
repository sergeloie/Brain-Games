package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random rnd = new Random();

    public static int getRandomNumber(int begin, int end) {
        return rnd.nextInt(begin, end);
    }

    public static int getRandomNumber(int end) {
        return rnd.nextInt(0, end);
    }

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int computeGCD(int x, int y) {
        int m = Math.max(x, y);
        int n = Math.min(x, y);
        while (m % n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        return n;
    }


    /**
     * @return возвращает true, если число чётное и false - если нечётное
     * @param x число, чётность которого проверяем
     */
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

}
