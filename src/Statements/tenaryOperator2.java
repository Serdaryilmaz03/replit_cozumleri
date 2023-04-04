package Statements;

import java.util.Scanner;

public class tenaryOperator2 {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();

        //WRITE YOUR CODE HERE:
int output =(num1>num2)?num1:num2;
        System.out.println(output);
    }
}