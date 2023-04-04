package methods.methodsWithReturn;

import java.util.EnumSet;
import java.util.Scanner;

public class stringExtractNumber {
    public static String extractNum(String s) {
        String nums = "";
        for (int i = 0; i < s.length(); i++) {
char chr=s.charAt(i);
            if (Character.isDigit(chr)) {
                nums = nums+chr;
            }
        }

        return nums;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }


}
