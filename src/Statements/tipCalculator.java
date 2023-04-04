package Statements;

import java.util.Scanner;

public class tipCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input:");
        System.out.println("Split or No split (Yes or No)");
        String split=scan.next();
        System.out.println("Number of people:");
        System.out.println("Check amount:");
        int amount= scan.nextInt();
        System.out.println("Service Quality:");
        String quality= scan.next();
        System.out.println();

    }
}
