package hexlet.code.games;


import hexlet.code.Engine;
import static hexlet.code.Engine.*;

public class Progression {

    public static void playProgression() {
        Engine.greetingUser();
        System.out.println("What number is missing in the progression?");
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
