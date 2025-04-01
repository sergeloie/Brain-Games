package hexlet.code;

import hexlet.code.games.Game;

import java.util.Map;
import java.util.Scanner;

public class Engine {

    private static final Scanner scan = new Scanner(System.in);
    private static final int NUMBER_OF_ROUNDS = 3;
    public static final int SUPREMUM = 100;

    public static void playGame(Game choosenGame) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scan.nextLine();
        System.out.println("Hello, " + userName);
        System.out.println(choosenGame.getRules());
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            Map<String, String> questionAndAnswer = choosenGame.getQuestionAndAnswer();
            String question = questionAndAnswer.keySet().stream().findFirst().get();
            String correctAnswer = questionAndAnswer.get(question);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scan.nextLine();
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", userAnswer, correctAnswer);
                System.out.printf("Let's try again, %s!%n", userName);
                System.exit(0);
            }
        }
        System.out.printf("Congratulations, %s!%n", userName);
    }
}
