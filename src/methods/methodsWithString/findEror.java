package methods.methodsWithString;

import java.util.Scanner;

public class findEror {
    public static boolean isError(String line) {
        if (line.substring(0, 5).equals("error")) {
            return true;
        } else {
            return false;
        }


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isError(in.nextLine()));
    }

}

