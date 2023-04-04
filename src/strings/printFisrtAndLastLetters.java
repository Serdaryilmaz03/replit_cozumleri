package strings;

import java.util.Scanner;

public class printFisrtAndLastLetters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word= scan.next();
       // char firstLetter=word.charAt(0);
        //char lastLetter=word.charAt(word.length()-1);
        System.out.println(word.charAt(0)+ ""+word.charAt(word.length()-1));
    }
}
