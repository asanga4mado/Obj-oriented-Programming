package FinalGrade;

import java.util.Scanner;

public class FinalGrade {

    public static void main(String[] args) {

        // grade variables
        float[] assignment = new float[6];

        Scanner s = new Scanner(System.in);

        // loop 6 times to get all assignment grades
        float finalGrade = 0.0f;
        float lowest = 100.0f;
        for (int i=0; i<6; i++) {
            System.out.print("Enter grade for assignment " + (i+1) + " : ");
            assignment[i] = s.nextFloat();

        }

        System.out.println("Your final grade is: " + finalGrade);
    }
}