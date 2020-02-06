package OOP.ShowChar;

// Write a method named showChar.
// The method should accept two arguments:
// a reference to a String object and an integer.
// The integer argument is a character position
// within the String, with the first character
// being at position 0. When the method executes,
// it should display the character at that character
// position.

public class ShowChar {

    public static void showChar(String str, int position) {
        System.out.println(str.charAt(position));
    }

    public static void main(String[] args) {

        // test 1: should output "w"
        showChar("New York", 2);

        // test 2: should output "W"
        showChar("Hello World", 6);

    }

}