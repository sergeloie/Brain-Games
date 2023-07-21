package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.rnd;

public class GCD {

    public static String askGCDQuestion() {
        int a = rnd.nextInt(1, Engine.SUPREMUM);
        int b = rnd.nextInt(1, Engine.SUPREMUM);
        System.out.printf("Question: %d %d%nYour answer: ", a, b);
        return computeGCD(a, b);
    }

    private static String computeGCD(int x, int y) {
        int m = Math.max(x, y);
        int n = Math.min(x, y);
        while (m % n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        return String.valueOf(n);
    }


}
