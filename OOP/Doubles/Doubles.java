package OOP.Doubles;

import java.util.Random;
import java.util.Scanner;

public class Doubles {

    public static void runGame() {

        // two dice for the doubles game
        int die1;
        int die2;

        // player starts with $100
        int money = 100;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String input;

        System.out.println("The Game Begins!");
        do {
            // roll the dice
            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;

            System.out.print("You rolled a " + die1);
            System.out.println(" and a " + die2);

            // shot doubles!
            if (die1 == die2) {
                System.out.println("You WIN!! ");
                money *= 2;
            } else {
                // lose $20, if not doubles
                System.out.println("You lose $20. ");
                money -= 20;
            }

            if (money > 0) {
                System.out.println("You now have $" + money);

                System.out.print("Play again? (y/n) ");
                input = scanner.nextLine();
            } else {
                System.out.println("You have lost all your money.");
                input = "n";
            }

        } while(input.equals("y"));
        System.out.println("The Game Ends...");
    }

    public static void main(String[] args) {
        runGame();
    }

}
