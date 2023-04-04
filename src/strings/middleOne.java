package strings;

import java.util.Scanner;

public class middleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int lenght = word.length();
        if (lenght == 1) {
            System.out.println(word.charAt(0) + "" + word.charAt(0) + word.charAt(0));
        } else if (lenght == 2) {
            System.out.println(word + word);
        } else if (lenght % 2 == 1) {
            System.out.println(word.charAt((word.length() - 1) / 2));
        } else if (lenght % 2 == 0) {
            System.out.println(word.charAt((word.length() - 2) / 2) + "" + word.charAt(word.length() / 2));
        }
    }
}
