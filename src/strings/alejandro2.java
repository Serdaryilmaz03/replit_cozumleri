package strings;

import java.util.Scanner;

public class alejandro2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if (a.contains("alejandro,project")){
            System.out.println("read");
        }else {
            System.out.println("don't read");
        }

    }
}