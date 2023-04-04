package Statements;

import java.util.Scanner;

public class burgerOrChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        if (in.equals("burger") || in.equals("chicken")) {

            System.out.println("10.0");
        } else if (in.equals("soda")) {
            double price2 = 2.0;
            System.out.println(price2);
        } else if (in.equals("fries")) {
            double price3 = 3.5;
            System.out.println(price3);
        }
    }
}
