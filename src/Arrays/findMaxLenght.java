package Arrays;

import java.util.Scanner;

public class findMaxLenght {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();

        }
        String longword = "";
        //write your code below
        for (int i = 0; i < words.length ; i++) {
            if (longword.length() < words[i].length()) {
             longword  = words[i];
            }

        }
        System.out.println(longword);

    }
}

