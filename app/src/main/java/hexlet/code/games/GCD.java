package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD implements Game {

    private int computeGCD(int x, int y) {
        int m = Math.max(x, y);
        int n = Math.min(x, y);
        while (m % n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        return n;
    }


    /**
     * @return возвращает правила игры
     */
    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }


    /**
     * @return задаёт вопрос игры и возвращает строку с ответом
     */
    @Override
    public String getQuestionAndAnswer() {
        int a = Utils.getRandomNumber(1, Engine.SUPREMUM);
        int b = Utils.getRandomNumber(1, Engine.SUPREMUM);
        System.out.printf("Question: %d %d%nYour answer: ", a, b);
        return String.valueOf(computeGCD(a, b));
    }
}
