package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.QAA;
import hexlet.code.Utils;

import static hexlet.code.Utils.isPrime;

public class Prime implements Game {

    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public QAA getQuestionAndAnswer() {
        int hiddenNumber = Utils.getRandomNumber(Engine.SUPREMUM);
        return new QAA(String.valueOf(hiddenNumber), isPrime(hiddenNumber) ? "yes" : "no");
    }
}
