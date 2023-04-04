package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintChars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
        String[] chars = new String[words.length];

        //TODO: Write your code below
        for (int i = 0; i < words.length; i++) {
            chars[i] = words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1);
        }

        System.out.println(Arrays.deepToString(chars));


    }
}


