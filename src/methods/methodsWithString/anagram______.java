package methods.methodsWithString;

import java.util.Arrays;
import java.util.Scanner;

public class anagram______ {
    public static boolean isAnagram(String word1, String word2) {

        // Do not touch below
        word1.toLowerCase();
        word2.toLowerCase();
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        System.out.println(Arrays.toString(chars1));
        System.out.println(Arrays.toString(chars2));
        if (Arrays.toString(chars1).equalsIgnoreCase(Arrays.toString(chars2))) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }

}


