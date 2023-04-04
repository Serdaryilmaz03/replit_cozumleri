package methods.methodsWithReturn;

import java.util.Scanner;

public class three3Locks {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        if (a == true && b == true) {
            return true;
        } else if (c == true) {
            return true;
        } else {
            return false;
        }


    }//end threeLocks

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(), in.nextBoolean()));
    }
}