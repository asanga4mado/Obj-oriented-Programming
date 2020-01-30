
package Assignment1c;

public class Assignment1c {

    public static void main(String[] args) {

        // Based on the previous question, expand your program to encrypt a word, phrase or sentence,
        // which may contain spaces, punctuation

        //e.g.
        //“This is a story about a man named Jed.” => “Guvf vf n fgbel nobhg n zna anzrq Wrq.”

        //Note that the letter case, the spacing and the punctuation match the original text


        Assignment1c assignment1c = new Assignment1c();
        assignment1c.ROT13Encrypt("This is a story about a man named Jed.");
    }

    private void ROT13Encrypt(String str) {
        StringBuilder encStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char aChar = str.charAt(i);
            if ((aChar >= 97 && aChar <= 109) || (aChar >= 65 && aChar <= 77)) {
                encStr.append((char) (aChar + 13));
            } else if ((aChar >= 110 && aChar <= 122) || (aChar >= 78 && aChar <= 90)) {
                encStr.append((char) (aChar - 13));
            } else {
                encStr.append(aChar);
            }
        }

        System.out.printf("String '%s' encrypted to '%s'\n", str, encStr.toString());
    }

}