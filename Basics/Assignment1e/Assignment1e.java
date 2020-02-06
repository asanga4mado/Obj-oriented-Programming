
package Basics.Assignment1e;

import java.util.Arrays;

public class Assignment1e {
    public static final int[] DATA = new int[]{70, 93, 99, 151, 224, 324, 737, 925, 729, 483, 128, 175};
    public static final String[] MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec"};

    public static void main(String[] args) {

        // Create a program that outputs a simple horizontal bar graph displaying the chart values.
        //Use an asterisk ‘*’ to represent 100 marriages and round the chart values to the nearest
        //100th marriage. Use arrays to simplify the logic.

        Assignment1e assignment1e = new Assignment1e();
        assignment1e.printStats();
    }

    private void printStats() {
        for (int i = 0; i < DATA.length; i++) {
            int numOfAsterisks = (int) Math.round(DATA[i] * 1.0 / 100);
            char[] asterisks = new char[numOfAsterisks];
            Arrays.fill(asterisks, '*');
            String strAsterisks = new String(asterisks);
            System.out.printf("%s: %s\n", MONTHS[i], strAsterisks);
        }
    }
}
