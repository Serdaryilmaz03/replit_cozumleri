package methods.methodsWithReturn;

import java.util.Scanner;

public class max {
    public static int max(int x, int max) {
        // Code here
        if (x > max) {
            return x;
        } else {
            return max;
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }


}
