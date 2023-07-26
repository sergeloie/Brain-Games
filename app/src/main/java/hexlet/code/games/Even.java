package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even implements Game {

    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String getQuestionAndAnswer() {
        int x = Utils.getRandomNumber(Engine.SUPREMUM);
        boolean evenCheck = (x % 2 == 0);
        System.out.println("Question: " + x);
        System.out.print("Your answer: ");
        return evenCheck ? "yes" : "no";
    }

}

