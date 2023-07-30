package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Game;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class Menu {

    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static Game chooseGame(int userEnteredNumber) {
        return switch (userEnteredNumber) {
            case (EVEN) -> new Even();
            case (CALC) -> new Calc();
            case (GCD) -> new GCD();
            case (PROGRESSION) -> new Progression();
            case (PRIME) -> new Prime();
            default -> throw new RuntimeException("Unexpected value: " + userEnteredNumber);
        };
    }
}
