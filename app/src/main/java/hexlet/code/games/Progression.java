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
        for (int i = 0; i < 3; i++) {
            String correctAnswer = askProgQuestion();
            String userAnswer = scan.nextLine();
            checkAnswer(userAnswer, correctAnswer);
        }
        System.out.printf("Congratulations, %s!%n", userName);
    }

    public static String askProgQuestion() {
        int sizeSequence = 10;
        int gap = rnd.nextInt(0, sizeSequence - 1);
        int increment = rnd.nextInt(1, 5);
        int begin = rnd.nextInt(10, 30);
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
