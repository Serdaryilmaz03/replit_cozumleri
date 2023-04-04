package methods.methodsWithReturn;

import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code
        String uniq = "";
        for (int i = 0; i < str.length(); i++) {
            if (!uniq.contains(String.valueOf(str.charAt(i)))){
                uniq+=String.valueOf(str.charAt(i));
            }
        }


        return uniq;

    }
}
