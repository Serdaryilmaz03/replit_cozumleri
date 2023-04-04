package methods.methodsWithString;

import java.util.Scanner;

public class palindrome {

public static boolean isPalindrome(String check) {

    // your code here
    String word=check.replace(" ", "");
    String str = "";
    for (int i = word.length() - 1; i >= 0; i--) {
        str += word.charAt(i);


    }
    return str.equalsIgnoreCase(word);
}
    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrome(in.nextLine()));
    }

}
