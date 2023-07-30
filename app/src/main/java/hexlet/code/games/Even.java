package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even implements Game {

    /**
     * @return возвращает правила игры
     */
    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    /**
     * @return возвращает true, если число чётное и false - если нечётное
     * @param x число, чётность которого проверяем
     */
    public boolean isEven(int x) {
        return x % 2 == 0;
    }

    /**
     * @return возвращает массив строк с вопросом и ответом
     */
    @Override
    public String[] getQuestionAndAnswer() {
        String[] qaa = new String[2];
        int x = Utils.getRandomNumber(Engine.SUPREMUM);
        qaa[Engine.QUESTION] = ("Question: " + x + "\n");
        qaa[Engine.QUESTION] += ("Your answer: ");
        qaa[Engine.ANSWER] = isEven(x) ? "yes" : "no";
        return qaa;
    }
}
