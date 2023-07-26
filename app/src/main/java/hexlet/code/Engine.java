package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {

    private static Scanner scan = new Scanner(System.in);

    private static String userName = "";
    private static final int NUMBER_OF_ROUNDS = 3;
    public static final int SUPREMUM = 100;



    public static void greetingUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scan.nextLine();
        System.out.println("Hello, " + userName);
    }

    public static void checkAnswer(String userAnswer, String correctAnswer) {
        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", userAnswer, correctAnswer);
            System.out.printf("Let's try again, %s!%n", userName);
            System.exit(0);
        }
    }

    public static void printGameRules(String gameName) {
        String gameRule = switch (gameName) {
            case ("Even") -> "Answer 'yes' if the number is even, otherwise answer 'no'.";
            case ("Calc") -> "What is the result of the expression?";
            case ("GCD") -> "Find the greatest common divisor of given numbers.";
            case ("Progression") -> "What number is missing in the progression?";
            case ("Prime") -> "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
            default -> "";
        };
        System.out.println(gameRule);
    }

    public static void playChosenGame(String chosenGame) {
        greetingUser();
        printGameRules(chosenGame);
        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            String correctAnswer = switch (chosenGame) {
                case ("Even") -> hexlet.code.games.Even.askEvenQuestion();
                case ("Calc") -> hexlet.code.games.Calc.askCalcQuestion();
                case ("GCD") -> hexlet.code.games.GCD.askGCDQuestion();
                case ("Progression") -> hexlet.code.games.Progression.askProgQuestion();
                case ("Prime") -> hexlet.code.games.Prime.askPrimeQuestion();
                default -> throw new IllegalStateException("Unexpected value: " + chosenGame);
            };
            String userAnswer = scan.nextLine();
            checkAnswer(userAnswer, correctAnswer);
        }
        System.out.printf("Congratulations, %s!%n", userName);
    }
}






