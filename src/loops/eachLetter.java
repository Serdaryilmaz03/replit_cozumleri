package loops;

import java.util.Scanner;

public class eachLetter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word= scan.next();
for (int i=0;i<=word.length()-1;i++){
    System.out.println(word.charAt(i));
}
    }

}
