import java.util.Scanner;

public class HighLowGame {
    public void run() {
        Player human = new Player();
        Player computer = new Player();
        boolean done = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Game Begins!\n");
        // Run unless interrupted or someone has no money to play
        while (!done && human.getMoney() > 0 && computer.getMoney() > 0) {
            System.out.println("You: $" + human.getMoney() + ", Computer: $" + computer.getMoney());
            System.out.println();
            System.out.print("What is your bet? $");
            int bet = input.nextInt();

            int computerBet = Player.getRnd().nextInt(computer.getMoney()) + 1;
            System.out.println("The computer bets: $" + computerBet);
            System.out.println();

            System.out.println("You both roll your dice....");
            human.roll();
            computer.roll();

            System.out.println("The computer rolled a " + computer.getDie1() + " and a " + computer.getDie2());
            System.out.println("You rolled a " + human.getDie1() + " and a " + human.getDie2());
            System.out.println();

            if (human.total() > computer.total()) {
                System.out.println("You WIN!");
                human.setMoney(human.getMoney() + bet);
                computer.setMoney(computer.getMoney() - computerBet);
            } else if (human.total() < computer.total()) {
                System.out.println("You LOST!");
                human.setMoney(human.getMoney() - bet);
                computer.setMoney(computer.getMoney() + computerBet);
            } else {
                System.out.println("Tie!");
            }

            if (human.getMoney() != 0) {
                System.out.print("Play again? (y/n)");
                String playAgain = input.next();
                if ("n".equals(playAgain)) {
                    done = true;
                }
            }
        }

        // Display result of game
        if (human.getMoney() == 0) {
            System.out.print("You lost all your money.");
        } else if (computer.getMoney() == 0) {
            System.out.print("Computer lost all it's money");
        }

        System.out.println("You left with $" + human.getMoney());
    }
}
