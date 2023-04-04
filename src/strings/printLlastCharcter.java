package strings;

import java.util.Scanner;

public class printLlastCharcter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       String word=scan.nextLine();
        System.out.println(word.charAt(word.length()-1));
    }

}
