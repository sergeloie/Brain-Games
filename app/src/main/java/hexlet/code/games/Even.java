package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.rnd;

public class Even {

    public static String askEvenQuestion() {

        int x = rnd.nextInt(Engine.SUPREMUM);
        boolean evenCheck = (x % 2 == 0);
        System.out.println("Question: " + x);
        System.out.print("Your answer: ");
        return evenCheck ? "yes" : "no";
    }
}

