package loops;

import java.util.Scanner;

public class countTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE

        for (int i=0;i<=str.length()-3;i++) {
            String substr = str.substring(i, i + 3);
            if (substr.charAt(0) == substr.charAt(1) && substr.charAt(0) == substr.charAt(2)) {
                count++;
            }
        }
            System.out.println(count);

    }
}
