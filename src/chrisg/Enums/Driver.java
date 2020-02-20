package chrisg.Enums;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);

        System.out.println("What is your favorite team?");
        //        String input = key.nextLine();
        String input = "mil";
        String i = input.substring(0, 3);
        switch (i.toUpperCase()) {
            case ("MIL"):
                i = "MILWAUKEE_BUCKS";
                break;
            case ("CHI"):
                i = "CHICAGO_BULLS";
                break;
            case ("IND"):
                i = "INDIANA_PACERS";
                break;
            default:
                i = null;
                break;


        }
        try {
            System.out.println(i.toString() + " is your favorite team!");
        } catch (Exception e) {
            System.out.println("That team is not listed here.");
        }
    }
}
