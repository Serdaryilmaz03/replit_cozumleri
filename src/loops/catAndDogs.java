package loops;

import java.util.Scanner;

public class catAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        for (int x=0;x<=word.length()-3;x++) {
            String catordog = word.substring(x,x+3);

        if (catordog.equals("cat")){
            countOfCats++;
        }else if (catordog.equals("dog")){
            countOfDogs++;
        }

    }
        System.out.println(countOfCats==countOfDogs);
    }
}
