package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.QAA;
import hexlet.code.Utils;

import static hexlet.code.Utils.computeGCD;

public class GCD implements Game {

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public QAA getQuestionAndAnswer() {
        int a = Utils.getRandomNumber(1, Engine.SUPREMUM);
        int b = Utils.getRandomNumber(1, Engine.SUPREMUM);
        return new QAA("%d %d".formatted(a, b), String.valueOf(computeGCD(a, b)));
    }
}
