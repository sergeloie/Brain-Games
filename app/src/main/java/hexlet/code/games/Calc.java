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
        for (int i = 0; i < Engine.numberOfRounds; i++) {
            String correctAnswer = askCalcQuestion();
            String userAnswer = scan.nextLine();
            checkAnswer(userAnswer, correctAnswer);
        }
        System.out.printf("Congratulations, %s!%n", userName);
    }

    public static String askCalcQuestion() {
        var signsArray = Arrays.asList("+", "-", "*");
        var operationalSign = signsArray.get(rnd.nextInt(signsArray.size()));
        int firstNumber = rnd.nextInt(Engine.supremum);
        int secondNumber = rnd.nextInt(Engine.supremum);
        int calcAnswer = 0;

        calcAnswer = switch (operationalSign) {
            case ("+") -> firstNumber + secondNumber;
            case ("-") -> firstNumber - secondNumber;
            case ("*") -> firstNumber * secondNumber;
            default -> throw new IllegalStateException("Unexpected value: " + operationalSign);
        };
        System.out.printf("Question: %d %s %d%n", firstNumber, operationalSign, secondNumber);
        System.out.print("Your answer: ");
        return String.valueOf(calcAnswer);
    }


}
