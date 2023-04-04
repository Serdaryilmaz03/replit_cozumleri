package methods;

import java.util.Scanner;

public class findCube {
    public static void main(String[] args) {

        cube();

    }

    public static void cube() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num * num * num);

    }
}

