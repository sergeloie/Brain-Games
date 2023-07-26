package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;

public class Calc implements Game{

    public static String askCalcQuestion() {
        var signsArray = Arrays.asList("+", "-", "*");
        var operationalSign = signsArray.get(Utils.getRandomNumber(signsArray.size()));
        int firstNumber = Utils.getRandomNumber(Engine.SUPREMUM);
        int secondNumber = Utils.getRandomNumber(Engine.SUPREMUM);
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


    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public String getQuestionAndAnswer() {
        var signsArray = Arrays.asList("+", "-", "*");
        var operationalSign = signsArray.get(Utils.getRandomNumber(signsArray.size()));
        int firstNumber = Utils.getRandomNumber(Engine.SUPREMUM);
        int secondNumber = Utils.getRandomNumber(Engine.SUPREMUM);
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
