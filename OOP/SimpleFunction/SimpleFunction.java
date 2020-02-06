package OOP.SimpleFunction;

public class SimpleFunction {

    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    public static int modifyNumber(int num) {
        num = num + 1;
        return num;
    }

    public static String addName(String name) {
        name = "Hello, " + name;
        return name;
    }

    public static void main(String[] args) {

        // passing by value
        int original_number = 12345;
        System.out.println(modifyNumber(original_number));
        System.out.println(original_number);

        // also passed by value
        String name = "John";
        System.out.println(addName(name));
        System.out.println(name);

    }

}