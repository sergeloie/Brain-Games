package hexlet.code.games;

import hexlet.code.QAA;

public interface Game {

    /**
     * @return возвращает правила игры
     */
    String getRules();

    /**
     * @return возвращает массив строк с вопросом и ответом
     */
    QAA getQuestionAndAnswer();
}
