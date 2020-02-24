import java.util.Random;

public class Player {
    private static Random rnd = new Random();   // Same random for all objects
    private int money;
    private int die1;
    private int die2;

    public Player() {
        money = 100;
    }

    public void roll() {
        die1 = rnd.nextInt(6) + 1;
        die2 = rnd.nextInt(6) + 1;
    }

    public int total() {
        return die1 + die2;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public static Random getRnd() {
        return rnd;
    }
}
