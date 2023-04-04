package methods.methodsWithReturn;

import java.util.Scanner;

public class isEven {
    public static boolean isEven(int n) {
        if (n%2==1){
            return true;
        }else {
            return false;
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }



}
