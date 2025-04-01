package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Map;

import static hexlet.code.Utils.computeGCD;

public class GCD implements Game {

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public Map<String, String> getQuestionAndAnswer() {
        int a = Utils.getRandomNumber(1, Engine.SUPREMUM);
        int b = Utils.getRandomNumber(1, Engine.SUPREMUM);
        return Map.of("%d %d".formatted(a, b), String.valueOf(computeGCD(a, b)));
    }
}
