package hexlet.code;

import hexlet.code.games.*;

public class Menu {

    public static Game chooseGame(int userEnteredNumber) {

        GamesEnum gamesEnum = GamesEnum.values()[userEnteredNumber];
        return switch (gamesEnum) {
            case EVEN -> new Even();
            case CALC -> new Calc();
            case GCD -> new GCD();
            case PROGRESSION -> new Progression();
            case PRIME -> new Prime();
            default -> throw new IllegalStateException("Unexpected value: " + gamesEnum);
        };
    }
}
