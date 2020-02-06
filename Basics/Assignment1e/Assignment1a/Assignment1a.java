package Basics.Assignment1e.Assignment1a;


public class Assignment1a {

    public static void main(String[] args) {

        //Fibonacci numbers are a series of numbers where the first two numbers are 1, and each subsequent number
        // is the sum of the two previous numbers.

        // e.g
        //1 1 2 3 5 8 13 ........

        // Create a program that calculates and outputs the first 20 numbers in the sequence on a single line.

        Assignment1a assignment1a = new Assignment1a();
        assignment1a.printFibonacci(20);
    }

    // define variables

    private void printFibonacci(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", calculateFibonacci(i));
        }
        System.out.println();
    }

    private int calculateFibonacci(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 1;
        else
            return calculateFibonacci(n - 2) + calculateFibonacci(n - 1);
    }
}
