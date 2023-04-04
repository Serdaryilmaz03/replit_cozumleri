package OOP.TEST1;

import java.util.Scanner;

public class PrintAtturbutes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Atts a = new Atts();
        a.name = in.nextLine();
        a.color = in.nextLine();
        a.amount = in.nextInt();

        System.out.println(a.asString());
    }
}

