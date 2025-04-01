package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Map;

import static hexlet.code.Utils.isEven;

public class Even implements Game {

    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public Map<String, String> getQuestionAndAnswer() {
        int x = Utils.getRandomNumber(Engine.SUPREMUM);
        return Map.of(String.valueOf(x), isEven(x) ? "yes" : "no");
    }
}
