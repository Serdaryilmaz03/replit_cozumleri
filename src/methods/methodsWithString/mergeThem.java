package methods.methodsWithString;

import java.util.Scanner;

public class mergeThem {

    public static String mergeStrings(String one, String two) {
        String merged = "";
        if (one.length() >= two.length()) {
            for (int i = 0; i < two.length(); i++) {
                merged = merged + one.charAt(i) + two.charAt(i);
            }
            for (int i=two.length();i<one.length();i++)
            merged+=one.charAt(i);
        } else {
            for (int i = 0; i < one.length(); i++) {
                merged = merged + one.charAt(i) + two.charAt(i);
            }
            for (int i=one.length();i<two.length();i++)
                merged+=two.charAt(i);

        }
        return merged;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }


}