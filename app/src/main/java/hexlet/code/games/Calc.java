package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;

public class Calc implements Game {

    /**
     * @return возвращает правила игры
     */
    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    /**
     * @return возвращает массив строк с вопросом и ответом
     */
    @Override
    public String[] getQuestionAndAnswer() {
        String[] qaa = new String[2];
        var signsArray = Arrays.asList("+", "-", "*");
        var operationalSign = signsArray.get(Utils.getRandomNumber(signsArray.size()));
        int firstNumber = Utils.getRandomNumber(Engine.SUPREMUM);
        int secondNumber = Utils.getRandomNumber(Engine.SUPREMUM);
        int calcAnswer = 0;

        calcAnswer = switch (operationalSign) {
            case ("+") -> firstNumber + secondNumber;
            case ("-") -> firstNumber - secondNumber;
            case ("*") -> firstNumber * secondNumber;
            default -> throw new RuntimeException("Unexpected value: " + operationalSign);
        };

        qaa[Engine.QUESTION] = "Question: " + firstNumber + " " + operationalSign + " " + secondNumber + "\n" + "Your answer: ";
        qaa[Engine.ANSWER] = String.valueOf(calcAnswer);
        return qaa;
    }
}
