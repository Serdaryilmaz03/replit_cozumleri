package loops;

import java.util.Scanner;

public class printNTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

}
