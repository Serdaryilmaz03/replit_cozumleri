package strings;

import java.util.Scanner;

public class getSandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if (str.contains("bread")) {
            int firstindex = str.indexOf("bread");
            int lastindex = str.lastIndexOf("bread");
            if (firstindex == lastindex) {
                System.out.println("nothing");
            } else {
                System.out.println(str.substring(firstindex+5, lastindex));
            }

        } else {
            System.out.println("nothing");
        }
    }
}
