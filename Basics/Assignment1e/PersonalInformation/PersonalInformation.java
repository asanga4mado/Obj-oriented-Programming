package Basics.Assignment1e.PersonalInformation;

public class PersonalInformation {

    public static void main(String[] args) {

        //Write a program that displays the following information
        //each on a seperate line
        // Your name
        // Your Address, with City, State, and ZIP
        // yOUR Telephone Number
        // Your college major
        // Although these items should be displayed on seperate output lines,
        // use only a single printIn statement in your program.


        String name = "Antoine Asanga";
        String address = "5685 Leeds St.";
        String city = "Halifax";
        String province = "NS";
        String postalCode = "B3K 2T3";
        String phone = "1-902-812-8850";
        String diploma = "Database Administration";


        System.out.println(
                name + "\n" + address + "\n" + city + "\n" + province + "\n" + postalCode + "\n" +
                phone + "\n" + diploma);
    }

}
