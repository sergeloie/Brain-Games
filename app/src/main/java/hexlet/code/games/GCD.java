package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.checkAnswer;
import static hexlet.code.Engine.rnd;
import static hexlet.code.Engine.scan;
import static hexlet.code.Engine.userName;

public class GCD {

    public static void playGCD() {

        Engine.greetingUser();
        Engine.printGameRules("GCD");
        for (int i = 0; i < Engine.numberOfRounds; i++) {
            String correctAnswer = askGCDQuestion();
            String userAnswer = scan.nextLine();
            checkAnswer(userAnswer, correctAnswer);
        }
        System.out.printf("Congratulations, %s!%n", userName);
    }

    public static String askGCDQuestion() {
        int a = rnd.nextInt(1, Engine.supremum);
        int b = rnd.nextInt(1, Engine.supremum);
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
