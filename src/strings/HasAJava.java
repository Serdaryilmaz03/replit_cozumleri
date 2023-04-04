package strings;

import javax.swing.*;
import java.util.Scanner;

public class HasAJava {
    public static void main(String[] args) {
        boolean exist = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.length() - 1 < 4) {
            exist = false;
        } else if (word.substring(0, 4).equalsIgnoreCase("java")) {
            exist = true;
        } else if (word.substring(1, 5).equalsIgnoreCase("java")) {
            exist = true;
        } else {
            exist = false;
        }
        System.out.println(exist);
    }


}
