package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {

    public static Scanner scan = new Scanner(System.in);
    public static Random rnd = new Random();
    public static String userName = "";

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





}
