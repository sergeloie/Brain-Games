package hexlet.code;

import hexlet.code.games.*;

import java.util.Map;
import java.util.Scanner;

public class App {

    public static Map<Integer, Game> games = Map.of(
            2, new Even(),
            3, new Calc(),
            4, new GCD(),
            5, new Progression(),
            6, new Prime());

    public static void main(String[] args) {

        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");

        games.forEach((key, value) -> System.out.printf("%d - %s%n", key, value.getClass().getSimpleName()));

        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner userInput = new Scanner(System.in);
        int idGame = userInput.nextInt();
        switch (idGame) {
            case 0 -> System.exit(0);
            case 1 -> Cli.greetings();
            default -> Engine.playGame(games.get(idGame));
        }
    }
}
