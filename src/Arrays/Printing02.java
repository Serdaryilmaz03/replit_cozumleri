package Arrays;

import java.util.Scanner;

public class Printing02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextLine();
        }
        // DO NOT TOUCH ABOVE
        for (int i = 0; i <= arr.length - 2; i+=2) {
            System.out.println(arr[i]+" , "+arr[i+1]);
        }
    }
}