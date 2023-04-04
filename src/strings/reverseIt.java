package strings;

import java.util.Scanner;

public class reverseIt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        int leght=word.length();
        if (leght>5){
            System.out.println("Too long!");
        }else if (leght<5){
            System.out.println("Too Short!");
        }else {
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        }



    }
}

