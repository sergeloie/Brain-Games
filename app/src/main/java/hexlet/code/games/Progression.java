package hexlet.code.games;


import hexlet.code.Engine;

import static hexlet.code.Engine.checkAnswer;
import static hexlet.code.Engine.rnd;
import static hexlet.code.Engine.scan;
import static hexlet.code.Engine.userName;

public class Progression {

    public static void playProgression() {
        Engine.greetingUser();
        Engine.printGameRules("Progression");
        for (int i = 0; i < Engine.numberOfRounds; i++) {
            String correctAnswer = askProgQuestion();
            String userAnswer = scan.nextLine();
            checkAnswer(userAnswer, correctAnswer);
        }
        System.out.printf("Congratulations, %s!%n", userName);
    }

    public static String askProgQuestion() {
        int sizeSequence = 10;
        int incMin = 1;
        int incMax = 5;
        int beginMin = 10;
        int beginMax = 30;
        int gap = rnd.nextInt(0, sizeSequence - 1);
        int increment = rnd.nextInt(incMin, incMax);
        int begin = rnd.nextInt(beginMin, beginMax);
        int[] progArray = new int[sizeSequence];
        System.out.print("Question:");
        for (int i = 0; i < sizeSequence; i++) {
            progArray[i] = begin + increment * i;
            System.out.print(i == gap ? " .." : " " + progArray[i]);
        }
        System.out.println();
        System.out.print("Your answer: ");
        return String.valueOf(progArray[gap]);
    }
}
