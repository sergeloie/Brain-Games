package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime implements Game {

    private static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * @return возвращает правила игры
     */
    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }


    /**
     * @return возвращает массив строк с вопросом и ответом
     */
    @Override
    public String[] getQuestionAndAnswer() {
        String[] qaa = new String[2];
        int hiddenNumber = Utils.getRandomNumber(Engine.SUPREMUM);
        qaa[0] = "Question: " + hiddenNumber + "\n" + "Your answer: ";
        qaa[1] = isPrime(hiddenNumber) ? "yes" : "no";
        return qaa;
    }
}
