package Arrays;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] splitarr=sentence.split(" ");
        for (int i=0;i<sentence.length();i++){
            System.out.println(splitarr[i]);
        }

    }
}
