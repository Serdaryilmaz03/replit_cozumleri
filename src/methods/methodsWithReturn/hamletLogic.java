package methods.methodsWithReturn;

import java.util.Scanner;

public class hamletLogic {
    public static boolean hamletQuote(boolean toBe, boolean notToBe) {
        // your code here
        if (toBe == true || notToBe == true) {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
    }
}
