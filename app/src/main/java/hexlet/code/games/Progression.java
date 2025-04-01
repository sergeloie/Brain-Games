package hexlet.code.games;

import hexlet.code.QAA;
import hexlet.code.Utils;

public class Progression implements Game {

    private final int SIZE_SEQUENCE = 10;
    private final int INC_MIN = 1;
    private final int INC_MAX = 5;
    private final int BEGIN_MIN = 10;
    private final int BEGIN_MAX = 30;

    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public QAA getQuestionAndAnswer() {
        StringBuilder stringProg = new StringBuilder();
        int gap = Utils.getRandomNumber(0, SIZE_SEQUENCE - 1);
        int increment = Utils.getRandomNumber(INC_MIN, INC_MAX);
        int begin = Utils.getRandomNumber(BEGIN_MIN, BEGIN_MAX);
        int[] progArray = new int[SIZE_SEQUENCE];
        for (int i = 0; i < SIZE_SEQUENCE; i++) {
            progArray[i] = begin + increment * i;
            if (i == gap) {
                stringProg.append(" ..");
            } else {
                stringProg.append(" ");
                stringProg.append(progArray[i]);
            }
        }
        return new QAA(stringProg.toString().trim(), String.valueOf(progArray[gap]));
    }
}
