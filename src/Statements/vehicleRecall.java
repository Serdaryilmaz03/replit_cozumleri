package Statements;

import java.util.Scanner;

public class vehicleRecall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();
        if ((vehicleYear>=1995&&vehicleYear<=1998)||(vehicleYear>=2001&&vehicleYear<=2002)||(vehicleYear>=2004&&vehicleYear<=2006)
        ||(vehicleYear>=2015&&vehicleYear<=2017)){
            System.out.println("Your vehicle needs to be recalled!");
        }else {
            System.out.println("Your vehicle is fine, enjoy!");
        }

    }
}
