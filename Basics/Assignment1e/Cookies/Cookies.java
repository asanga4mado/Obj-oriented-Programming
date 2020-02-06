package Basics.Assignment1e.Cookies;

import java.util.Scanner;

public class Cookies {

    public static void main(String[] args) {

        int cookiesInABag = 40;
        int servingInABag = 10;
        int servingCalories = 300;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();

        // User enters number of cookies eaten
        System.out.print("How many cookies did you eat? ");
        int numCookies = s.nextInt();


        // output calories consumed
        int servingSize = cookiesInABag / servingInABag;
        float userServings = (float)numCookies / (float)servingSize;
        float userCalories = userServings * servingCalories;

        System.out.println(
                name + ", you ate " +
                userCalories + "calories"
        );

    }
}
