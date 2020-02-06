package Basics.Assignment1e.Assignment1b;

public class Assignment1b {

    public static final String WORD = "secret";

    public static void main(String[] args) {

        // ROT13 cipher is a very simple encryption cipher that rotates the alphabet by 13 letters to change
        // "A" to "N", "B" to "O", "C" to "P", "X" to "K", "Y" to "L", "Z" to "M", etc.

        //e.g
        //"Secret" would be encrypted to "frperg"

        //Create a program that takes a single word in lowercase letters, stored as a constant
        //variable, and outputs it as a ROT13 encrypted version.


        Assignment1b assignment1b = new Assignment1b();
        assignment1b.ROT13Encrypt(WORD);
    }

    private void ROT13Encrypt(String word) {
        StringBuilder encWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char aChar = word.charAt(i);
            if (aChar >= 97 && aChar <= 109) {
                encWord.append((char) (aChar + 13));
            } else if (aChar >= 110 && aChar <= 122) {
                encWord.append((char) (aChar - 13));
            }
        }

        System.out.printf("Word '%s' encrypted to '%s'\n", word, encWord.toString());
    }
}
