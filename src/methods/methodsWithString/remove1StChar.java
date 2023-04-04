package methods.methodsWithString;

import java.util.Scanner;

public class remove1StChar {
    public static String removeFirst(String target) {

        return target.replaceFirst(target.substring(0, 1), "");

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(removeFirst(in.next()));
    }

}

