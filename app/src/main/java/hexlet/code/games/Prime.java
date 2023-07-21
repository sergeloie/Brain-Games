package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.checkAnswer;
import static hexlet.code.Engine.rnd;
import static hexlet.code.Engine.scan;
import static hexlet.code.Engine.userName;
import static java.util.Arrays.binarySearch;

public class Prime {

    public static void playPrime() {
        Engine.greetingUser();
        Engine.printGameRules("Prime");
        for (int i = 0; i < 3; i++) {
            String correctAnswer = askPrimeQuestion();
            String userAnswer = scan.nextLine();
            checkAnswer(userAnswer, correctAnswer);
        }
        System.out.printf("Congratulations, %s!%n", userName);
    }

    public static String askPrimeQuestion() {
        int[] primeArray = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
        int hiddenNumber = rnd.nextInt(100);
        System.out.printf("Question: %d%nYour answer: ", hiddenNumber);
        return binarySearch(primeArray, hiddenNumber) >= 0 ? "yes" : "no";
    }
}
