package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.checkAnswer;
import static hexlet.code.Engine.rnd;
import static hexlet.code.Engine.scan;
import static hexlet.code.Engine.userName;

public class Prime {

    public static void playPrime() {
        Engine.greetingUser();
        Engine.printGameRules("Prime");
        for (int i = 0; i < Engine.numberOfRounds; i++) {
            String correctAnswer = askPrimeQuestion();
            String userAnswer = scan.nextLine();
            checkAnswer(userAnswer, correctAnswer);
        }
        System.out.printf("Congratulations, %s!%n", userName);
    }

    public static String askPrimeQuestion() {
        int hiddenNumber = rnd.nextInt(Engine.supremum);
        System.out.printf("Question: %d%nYour answer: ", hiddenNumber);
        return isPrime(hiddenNumber) ? "yes" : "no";
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
