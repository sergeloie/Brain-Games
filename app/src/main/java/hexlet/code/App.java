package hexlet.code;

import hexlet.code.games.*;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        for (String s : Arrays.asList("Please enter the game number and press Enter.", "1 - Greet", "2 - Even", "3 - Calc", "4 - GCD", "5 - Progression", "6 - Prime", "0 - Exit")) {
            System.out.println(s);
        }
        System.out.print("Your choice: ");
        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine();

        switch (userChoice) {
            case "1" -> Cli.greetings();
            case "2" -> Even.playEven();
            case "3" -> Calc.playCalc();
            case "4" -> GCD.playGCD();
            case "5" -> Progression.playProgression();
            case "6" -> Prime.playPrime();
            default -> {
            }
        }
    }
}
