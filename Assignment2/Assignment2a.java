package Assignment2;

public class Assignment2a {
    public static void main(String[] args) {
        int result = Assignment2a.exp(2, 8);
        System.out.println("2^8=" + result);
    }

    /**
     * Calculate of the base to the exponent
     *
     * @param base     Base
     * @param exponent Exponent
     * @return Value of the base to the exponent
     */
    private static int exp(int base, int exponent) {
        int result = base;

        for (int i = 1; i < exponent; i++) {
            result *= base;
        }

        return result;
    }
}