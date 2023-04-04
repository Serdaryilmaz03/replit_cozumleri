package methods;

import java.util.Scanner;

public class prinrNext3nums {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3(num);
    }
    public static void next3(int value){
        System.out.println("next 3 are:");
        System.out.println((value+1)+" "+(value+2)+" "+(value+3));


    }

}
