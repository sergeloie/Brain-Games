package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Game;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {

    private static Scanner scan = new Scanner(System.in);
    private static String userName;
    public int idGame;
    private static final int NUMBER_OF_ROUNDS = 3;
    public static final int SUPREMUM = 100;



    public static void checkAnswer(String userAnswer, String correctAnswer) {
        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", userAnswer, correctAnswer);
            System.out.printf("Let's try again, %s!%n", userName);
            System.exit(0);
        }
    }

    public static void playGameById(int idGame) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scan.nextLine();
        System.out.println("Hello, " + userName);
        Game game1 = switch (idGame) {
            case (2) -> new Even();
            case (3) -> new Calc();
            case (4) -> new GCD();
            case (5) -> new Progression();
            case (6) -> new Prime();
            default -> throw new IllegalStateException("Unexpected value: " + idGame);
        };
        System.out.println(game1.getRules());
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            String correctAnswer = game1.getQuestionAndAnswer();
            String userAnswer = scan.nextLine();
            checkAnswer(userAnswer, correctAnswer);
        }
        System.out.printf("Congratulations, %s!%n", userName);
    }
}






