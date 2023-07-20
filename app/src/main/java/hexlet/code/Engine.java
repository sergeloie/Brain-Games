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
            System.out.printf("Let's try again, %s%n", userName);
            System.exit(0);
        }
    }





}
