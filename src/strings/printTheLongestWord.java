package strings;

import java.util.Scanner;

public class printTheLongestWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word1=scan.next();
        String word2=scan.next();
        int word1lenght=word1.length();
        int word2lenght=word2.length();
        if (word1.length()> word2.length()){
            System.out.println(word1);
        }else if (word1.length()<word2.length()){
            System.out.println(word2);
        }
    }
}
