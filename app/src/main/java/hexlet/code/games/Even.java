package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.checkAnswer;
import static hexlet.code.Engine.rnd;
import static hexlet.code.Engine.scan;
import static hexlet.code.Engine.userName;


public class Even {

    public static void playEven() {

        Engine.greetingUser();
        Engine.printGameRules("Even");
        for (int i = 0; i < Engine.numberOfRounds; i++) {
            String correctAnswer = askEvenQuestion();
            String userAnswer = scan.nextLine();
            checkAnswer(userAnswer, correctAnswer);
        }
        System.out.printf("Congratulations, %s!%n", userName);
    }

    public static String askEvenQuestion() {

        int x = rnd.nextInt(Engine.supremum);
        boolean evenCheck = (x % 2 == 0);
        System.out.println("Question: " + x);
        System.out.print("Your answer: ");
        return evenCheck ? "yes" : "no";
    }
}

