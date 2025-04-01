package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.QAA;
import hexlet.code.Utils;

import static hexlet.code.Utils.isEven;

public class Even implements Game {

    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public QAA getQuestionAndAnswer() {
        int x = Utils.getRandomNumber(Engine.SUPREMUM);
        return new QAA(String.valueOf(x), isEven(x) ? "yes" : "no");
    }
}
