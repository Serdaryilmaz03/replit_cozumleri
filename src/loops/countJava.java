package loops;

import java.util.Scanner;

public class countJava {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word = scan.next();
        int output=0;
        for (int i=0;i<=word.length()-4;i++){
            String substr=word.substring(i,i+4);
            if (substr.equals("java")){
                output++;
            }

        }
        System.out.println(output);
    }
}
