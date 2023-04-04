package Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        String[] array = email.split("@");
        if (email.contains("@")) {

            for (int i = 0; i < array.length; i++) {

            }
            if (array.length == 2) {
                System.out.println("Email id: " + array[0]);
                System.out.println("Email domain: " + array[1]);
            }else {
                System.out.println("invalid email");

            }
        } else {
            System.out.println("invalid email");
        }
    }
}

