package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.List;
import java.util.Map;

public class Calc implements Game {

    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public Map<String, String> getQuestionAndAnswer() {
        List<String> signsArray = List.of("+", "-", "*");
        String operationalSign = signsArray.get(Utils.getRandomNumber(signsArray.size()));
        int firstNumber = Utils.getRandomNumber(Engine.SUPREMUM);
        int secondNumber = Utils.getRandomNumber(Engine.SUPREMUM);

        int calcAnswer = switch (operationalSign) {
            case ("+") -> firstNumber + secondNumber;
            case ("-") -> firstNumber - secondNumber;
            case ("*") -> firstNumber * secondNumber;
            default -> throw new RuntimeException("Unexpected value: " + operationalSign);
        };
        return Map.of("%d %s %d".formatted(firstNumber, operationalSign, secondNumber), String.valueOf(calcAnswer));
    }
}
