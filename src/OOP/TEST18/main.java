package OOP.TEST18;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Square s = new Square(in.nextDouble());
        Cube c = new Cube(in.nextDouble());
        Rectangle r = new Rectangle(in.nextDouble(), in.nextDouble());
        System.out.println(r.getLenght());
        r.setLenght(in.nextDouble());
        System.out.println(r.getLenght());
        System.out.println(s.getLenght());
        System.out.println(s.circumferenceCalc());
        System.out.println(c.circumferenceCalc());

    }
}
