package hexlet.code.games;

public interface Game {

    String getRules();

    /**
     * @return возвращает массив строк с вопросом и ответом
     */
    String[] getQuestionAndAnswer();
}
