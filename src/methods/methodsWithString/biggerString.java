package methods.methodsWithString;

import java.util.Scanner;

public class biggerString {
    public static String bigger(String a ,String b){
        if (a.length()>=b.length()){
            return a;
        }else {
            return b;
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(bigger(in.next(), in.next()));
    }
}
