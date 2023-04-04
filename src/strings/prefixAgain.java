package strings;

import java.util.Scanner;

public class prefixAgain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        String prefix = str.substring(0, n);
        str = str.substring(n);
        if (str.contains(prefix)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
