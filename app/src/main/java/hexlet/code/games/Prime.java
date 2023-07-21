package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.rnd;

public class Prime {

    public static String askPrimeQuestion() {
        int hiddenNumber = rnd.nextInt(Engine.SUPREMUM);
        System.out.printf("Question: %d%nYour answer: ", hiddenNumber);
        return isPrime(hiddenNumber) ? "yes" : "no";
    }

    private static boolean isPrime(int x) {
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
}
