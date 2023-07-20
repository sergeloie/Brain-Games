package hexlet.code;

import java.util.Scanner;
public class Cli {

    public static void greetings() {

        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String nameUser = sc.nextLine();
        System.out.printf("Hello, %s!", nameUser);
    }
}
