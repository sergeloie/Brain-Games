package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;

import static hexlet.code.Engine.checkAnswer;
import static hexlet.code.Engine.rnd;
import static hexlet.code.Engine.scan;
import static hexlet.code.Engine.userName;

public class Calc {

    public static void playCalc() {
        Engine.greetingUser();
        Engine.printGameRules("Calc");
        for (int i = 0; i < 3; i++) {
            String correctAnswer = askCalcQuestion();
            String userAnswer = scan.nextLine();
            checkAnswer(userAnswer, correctAnswer);
        }
        System.out.printf("Congratulations, %s!%n", userName);
    }

    public static String askCalcQuestion() {
        var signsArray = Arrays.asList("+", "-", "*");
        var operationalSign = signsArray.get(rnd.nextInt(signsArray.size()));
        int firstNumber = rnd.nextInt(100);
        int secondNumber = rnd.nextInt(100);
        int calcAnswer = 0;

        switch (operationalSign) {
            case ("+") -> calcAnswer = firstNumber + secondNumber;
            case ("-") -> calcAnswer = firstNumber - secondNumber;
            case ("*") -> calcAnswer = firstNumber * secondNumber;
            default -> {
            }
        }
        System.out.printf("Question: %d %s %d%n", firstNumber, operationalSign, secondNumber);
        System.out.print("Your answer: ");
        return String.valueOf(calcAnswer);
    }


}
