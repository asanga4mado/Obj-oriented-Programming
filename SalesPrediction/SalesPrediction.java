package SalesPrediction;

public class SalesPrediction {

    // The East Coast sales

    public static void main(String[] args) {

        int sales  = 4_600_000;
        float percentage = 0.62f;

        float prediction = sales * percentage;

        System.out.println(
                "East Coast Sales division will generate $" + prediction + " in sales. ");


    }
}
