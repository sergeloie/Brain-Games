package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;

import static hexlet.code.Engine.rnd;

public class Calc {

    public static String askCalcQuestion() {
        var signsArray = Arrays.asList("+", "-", "*");
        var operationalSign = signsArray.get(rnd.nextInt(signsArray.size()));
        int firstNumber = rnd.nextInt(Engine.SUPREMUM);
        int secondNumber = rnd.nextInt(Engine.SUPREMUM);
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
