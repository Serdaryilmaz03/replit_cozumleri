package methods.methodsWithString;

import java.util.Scanner;

public class reverseString {
    public static String reverse(String input) {
        String str = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            str += input.charAt(i);
        }

        return str;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }

}

