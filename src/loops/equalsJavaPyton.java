package loops;

import java.util.Scanner;

public class equalsJavaPyton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int x = 0;
        int y = 0;
        for (int i = 0; i <= sentence.length() - 4; i++) {
            String subjava = sentence.substring(i, i + 4);

            if (subjava.equals("java")) {
                x++;

            }
        }
        for (int j = 0; j <= sentence.length() - 6; j++) {
            String subpython = sentence.substring(j, j + 6);

            if (subpython.equals("python")) {
                y++;
            }

        }


        System.out.println(x == y);
    }
}