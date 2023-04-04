package Statements;

import java.util.Scanner;

public class androidVersions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double version = input.nextDouble();
        if (version == 1.5) {
            System.out.println("Cupcake");
            return;
        }
        if (version == 1.6) {
            System.out.println("Donut");
            return;
        }
        if (version == 2.1) {
            System.out.println("Eclair");
            return;
        }
        if (version == 2.2) {
            System.out.println("Froyo");
            return;
        }
        if (version == 2.3) {
            System.out.println("Gingerbread");
            return;
        }
        if (version == 3.1) {
            System.out.println("Honeycomb");
            return;
        }
        if (version == 4.0) {
            System.out.println("Ice Cream Sandiwich");
        }
        if (version == 4.1) {
            System.out.println("Jelly Bean");
            return;
        }
        if (version == 4.4) {

            System.out.println("KitKat");

            return;
        }
        if (version == 5.0) {
            System.out.println("Lollipop");
            return;
        }
        if (version == 8.0) {
            System.out.println("Oreo");
            return;
        }
        if (version == 9.0) {
            System.out.println("Pie");
            return;

        }else {
            System.out.println("Sorry, I don't know this version!");
        }
    }
}

