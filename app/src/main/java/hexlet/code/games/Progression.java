package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression implements Game {

    public static final int SIZE_SEQUENCE = 10;
    public static final int INC_MIN = 1;
    public static final int INC_MAX = 5;
    public static final int BEGIN_MIN = 10;
    public static final int BEGIN_MAX = 30;

    /**
     * @return возвращает правила игры
     */
    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    /**
     * @return возвращает массив строк с вопросом и ответом
     */
    @Override
    public String[] getQuestionAndAnswer() {
        String[] qaa = new String[2];
        var stringProg = new StringBuilder();
        int gap = Utils.getRandomNumber(0, SIZE_SEQUENCE - 1);
        int increment = Utils.getRandomNumber(INC_MIN, INC_MAX);
        int begin = Utils.getRandomNumber(BEGIN_MIN, BEGIN_MAX);
        int[] progArray = new int[SIZE_SEQUENCE];
        stringProg.append("Question:");
        for (int i = 0; i < SIZE_SEQUENCE; i++) {
            progArray[i] = begin + increment * i;
            if (i == gap) {
                stringProg.append(" ..");
            } else {
                stringProg.append(" ");
                stringProg.append(progArray[i]);
            }
        }
        stringProg.append("%n");
        stringProg.append("Your answer: ");
        qaa[Engine.QUESTION] = stringProg.toString();
        qaa[Engine.ANSWER] = String.valueOf(progArray[gap]);
        return qaa;
    }
}
