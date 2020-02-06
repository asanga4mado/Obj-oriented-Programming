
package Basics.Assignment1e.Assignment1d;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1d {

    public static void main(String[] args) {

        Assignment1d assignment1d = new Assignment1d();
        assignment1d.generateCreateTableStatement();
    }

    private void generateCreateTableStatement() {
        Scanner input = new Scanner(System.in);
        input.useDelimiter(",\\s*");

        System.out.print("Table name: ");
        String tableName = input.nextLine();

        List<String> params = new ArrayList<>();
        boolean done = false;
        while (!done) {
            System.out.print("Field info (ENTER to end): ");
            String aParam = input.nextLine();
            if (aParam == null || aParam.length() == 0) {
                done = true;
            } else {
                params.add(aParam);
            }
        }

        System.out.printf("CREATE TABLE %s (\n", tableName);
        for (String param : params) {
            System.out.println("  " + param);
        }
        System.out.println(");");
    }
}
