package methods.methodsWithString;

import java.util.Scanner;

public class limitString {
    public static String limit(String text, int maxLength) {
        // your code
        String newtext = "";
        for (int i = 0; i < maxLength; i++) {
            newtext += text.charAt(i);
        }

        return newtext;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(limit(in.nextLine(), in.nextInt()));
    }

}

