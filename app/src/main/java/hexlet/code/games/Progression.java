package hexlet.code.games;

import hexlet.code.Utils;

public class Progression implements Game {

    public static final int sizeSequence = 10;
    public static final int incMin = 1;
    public static final int incMax = 5;
    public static final int beginMin = 10;
    public static final int beginMax = 30;


    /**
     * @return возвращает правила игры
     */
    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    /**
     * @return задаёт вопрос игры и возвращает строку с ответом
     */
    @Override
    public String getQuestionAndAnswer() {

        var stringProg = new StringBuilder();
        int gap = Utils.getRandomNumber(0, sizeSequence - 1);
        int increment = Utils.getRandomNumber(incMin, incMax);
        int begin = Utils.getRandomNumber(beginMin, beginMax);
        int[] progArray = new int[sizeSequence];
        stringProg.append("Question:");
        for (int i = 0; i < sizeSequence; i++) {
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
        System.out.printf(stringProg.toString());
        return String.valueOf(progArray[gap]);
    }
}
