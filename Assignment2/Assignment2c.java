public class Assignment2c {
    public static void main(String[] args) {
        Player test = new Player();
        System.out.println("Create player");
        System.out.println("Current money is " + test.getMoney());
        test.setMoney(test.getMoney() + 20);
        System.out.println("Add $20");
        System.out.println("Current money is " + test.getMoney());
        test.setMoney(test.getMoney() - 30);
        System.out.println("Deduct $30");
        System.out.println("Current money is " + test.getMoney());
        test.roll();
        System.out.println("Current roll is " + test.getDie1() + " and " + test.getDie2() + ", total is " + test.total());
        test.roll();
        System.out.println("Current roll is " + test.getDie1() + " and " + test.getDie2() + ", total is " + test.total());
        test.roll();
        System.out.println("Current roll is " + test.getDie1() + " and " + test.getDie2() + ", total is " + test.total());
    }
}
