package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static String askProgQuestion() {
        final int sizeSequence = 10;
        final int incMin = 1;
        final int incMax = 5;
        final int beginMin = 10;
        final int beginMax = 30;
        int gap = Utils.getRandomNumber(0, sizeSequence - 1);
        int increment = Utils.getRandomNumber(incMin, incMax);
        int begin = Utils.getRandomNumber(beginMin, beginMax);
        int[] progArray = new int[sizeSequence];
        System.out.print("Question:");
        for (int i = 0; i < sizeSequence; i++) {
            progArray[i] = begin + increment * i;
            System.out.print(i == gap ? " .." : " " + progArray[i]);
        }
        System.out.println();
        System.out.print("Your answer: ");
        return String.valueOf(progArray[gap]);
    }
}
