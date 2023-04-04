package Statements;

import java.util.Scanner;

public class consoleMenu {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES.
        Scanner s = new Scanner(System.in);

        System.out.println("---------------");
        System.out.println("select an option:");
        System.out.println("1) option 1");
        System.out.println("2) option 2");
        System.out.println("3) option 3");
        System.out.println("---------------");

        int choice = s.nextInt();
        if (choice == 1) {
            System.out.println("user selected 1");
            return;
        }
        if (choice == 2) {
            System.out.println("user selected 2");
            return;
        }


        if (choice == 3) {
            System.out.println("user selected 3");

            return;
        }
    }
}
