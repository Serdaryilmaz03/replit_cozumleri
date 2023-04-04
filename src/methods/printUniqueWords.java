package methods;

import java.util.Scanner;

public class printUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {
        //WRITE YOUR CODE HERE
        for (int i = 0; i < words.length; i++) {
            boolean unique = true;

            for (int j = 0; j < words.length; j++) {
                if (i != j && words[i].equals(words[j])) {
                    unique = false;
                    break;

                }

            }
            if (unique==true) {
                System.out.println(words[i]);
            }
        }
    }
}