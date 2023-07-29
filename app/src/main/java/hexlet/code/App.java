package hexlet.code;

import java.util.Scanner;


public class App {


    public static void main(String[] args) {

        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        Menu.printGameList();
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner userInput = new Scanner(System.in);
        int idGame = userInput.nextInt();
        if (idGame == 1) {
            Cli.greetings();
        }
        if (idGame == 0) {
            System.exit(0);
        }
        Engine.playGame(Menu.chooseGame(idGame));
    }
}
