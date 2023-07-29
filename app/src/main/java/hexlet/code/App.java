package hexlet.code;

import java.util.Scanner;

public class App {

    public static final int even = 2;
    public static final int calc = 3;
    public static final int gcd = 4;
    public static final int progression = 5;
    public static final int prime = 6;
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
        int idGame = userInput.nextInt();
        if (idGame == 1) {
            Cli.greetings();
        }
        if (idGame == 0) {
            System.exit(0);
        }
        Engine.playGameById(idGame);
//

//        }
    }
}
