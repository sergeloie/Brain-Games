package hexlet.code.games;

import java.util.Map;

public interface Game {

    /**
     * @return возвращает правила игры
     */
    String getRules();

    /**
     * @return возвращает массив строк с вопросом и ответом
     */
    Map<String, String> getQuestionAndAnswer();
}
