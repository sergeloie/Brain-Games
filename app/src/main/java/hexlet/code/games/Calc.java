package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;

public class Calc {

    public static String askCalcQuestion() {
        var signsArray = Arrays.asList("+", "-", "*");
        var operationalSign = signsArray.get(Engine.getRandomNumber(signsArray.size()));
        int firstNumber = Engine.getRandomNumber(Engine.SUPREMUM);
        int secondNumber = Engine.getRandomNumber(Engine.SUPREMUM);
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
