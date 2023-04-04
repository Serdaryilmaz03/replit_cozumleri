package loops;

import java.util.Scanner;

public class printVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char subvow = word.charAt(i);
            if (subvow=='a'||subvow=='e'||subvow=='i'||subvow=='o'||subvow=='u'
            ) {
                System.out.print(subvow);
            }
        }
    }
}