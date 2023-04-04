package methods;

import java.util.Scanner;

public class fibonaccinums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num) {
        //WRITE YOUR CODE HERE
        int num1 = 0;
        int num2 = 1;
        int num3 = num1 + num2;
        while (num > 2) {
            num--;
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }

        System.out.println(num3);

    }
}