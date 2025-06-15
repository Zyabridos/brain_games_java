package hexlet.code;

import hexlet.code.games.IsEven;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        if (choice.equals("0")) return;

        String userName = Cli.greet();

        switch (choice) {
            case "1" -> {}
            case "2" -> Engine.run(IsEven.getRules(), IsEven.prepareRounds(), userName);
            case "3" -> Engine.run(Calc.getRules(), Calc.prepareRounds(), userName);
            case "4" -> Engine.run(GCD.getRules(), GCD.prepareRounds(), userName);
            default -> System.out.println("Invalid option.");
        }

        scanner.close();
    }
}
