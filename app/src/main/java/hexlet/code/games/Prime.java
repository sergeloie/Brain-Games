package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Map;

import static hexlet.code.Utils.isPrime;

public class Prime implements Game {

    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public Map<String, String> getQuestionAndAnswer() {
        int hiddenNumber = Utils.getRandomNumber(Engine.SUPREMUM);
        return Map.of(String.valueOf(hiddenNumber), isPrime(hiddenNumber) ? "yes" : "no");
    }
}
