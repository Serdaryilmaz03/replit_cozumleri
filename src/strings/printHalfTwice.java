package strings;

import java.util.Scanner;

public class printHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HE
        int halflenght=word.length()/2;
        System.out.println(word.substring(0,halflenght)+""+word.substring(0,halflenght));
    }
}
