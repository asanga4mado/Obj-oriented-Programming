package FinalGrade;

import java.util.Scanner;

public class FinalGrade {

    public static void main(String[] args) {

        // grade variables
        float[] assignments = new float[6];

        Scanner s = new Scanner(System.in);

        // loop 6 times to get all assignment grades
        for (int i=0; i<assignments.length; i++) {
            System.out.print("Enter grade for assignment " + (i+1) + ": ");
            assignments[i] = s.nextFloat();
        }

        // find the lowest grade
        float lowest = 100.0f;
        int lowestIndex = 0;
        for (int i=0; i<assignments.length; i++) {
            if (assignments[i] < lowest) {
                lowest = assignments[i];
                lowestIndex = i;
            }
        }

        // display all grades
        for (int i=0; i<assignments.length; i++) {
            if (i == lowestIndex) {
                System.out.println(
                        "Assignment " + (i+1) + ": " +
                                assignments[i] + " (lowest)"
                );
            } else {
                System.out.println(
                        "Assignment " + (i + 1) + ": " +
                                assignments[i]);
            }
        }

        // calculate the final grade
        float finalGrade = 0.0f;

        for (int i=0; i<assignments.length; i++) {
            if (i != lowestIndex) {
                finalGrade += assignments[i];
            }
        }
        // subtracted one to account for optional assignment
        finalGrade /= (assignments.length - 1);

        System.out.println("Your final grade is: " + finalGrade);
    }
}