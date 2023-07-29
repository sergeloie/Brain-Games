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
     * @return задаёт вопрос игры и возвращает строку с ответом
     */
    @Override
    public String getQuestionAndAnswer() {
        int x = Utils.getRandomNumber(Engine.SUPREMUM);
        System.out.println("Question: " + x);
        System.out.print("Your answer: ");
        return isEven(x) ? "yes" : "no";
    }

    public boolean isEven(int x) {
        return x % 2 == 0;
    }

}

