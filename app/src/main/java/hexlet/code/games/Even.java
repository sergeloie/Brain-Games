package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static String askEvenQuestion() {

        int x = Engine.getRandomNumber(Engine.SUPREMUM);
        boolean evenCheck = (x % 2 == 0);
        System.out.println("Question: " + x);
        System.out.print("Your answer: ");
        return evenCheck ? "yes" : "no";
    }
}

