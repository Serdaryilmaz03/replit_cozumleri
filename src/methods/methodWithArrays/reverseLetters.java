package methods.methodWithArrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class reverseLetters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));

    }

    public static String reverseNoSpec(String str) {

        // your code here
        char[] strArray = new char[str.length()];
        for (int i = 0, j = str.length() - 1; i < j; ) {
            if (!Character.isLetter(str.charAt(i))) {
                strArray[i] = str.charAt(i);
                i++;
            } else if (!Character.isLetter(str.charAt(j))) {
                strArray[j] = str.charAt(j);
                j--;
            } else {
                strArray[i] = str.charAt(j);
                strArray[j--] = str.charAt(i++);
            }

        }
        String s = Arrays.toString(strArray);
        s.replace(" ","");
        System.out.println(s);
        return s;

    }
}