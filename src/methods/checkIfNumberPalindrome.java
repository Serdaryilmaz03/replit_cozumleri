package methods;

import java.util.Scanner;

public class checkIfNumberPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        int temp=num;
        int num1=0;
        while (temp!=0){
            num1=(num1*10)+temp%10;
            temp=temp/10;

        }
        System.out.println(num==num1);

    }
}

