package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine();

        switch (userChoice) {
            case "1" -> Cli.greetings();
            case "2" -> Engine.playChosenGame("Even");
            case "3" -> Engine.playChosenGame("Calc");
            case "4" -> Engine.playChosenGame("GCD");
            case "5" -> Engine.playChosenGame("Progression");
            case "6" -> Engine.playChosenGame("Prime");
            default -> {
            }
        }
    }
}
