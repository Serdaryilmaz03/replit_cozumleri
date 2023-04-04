package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class copyAndCertain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));

    }


    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
        String value = "";
        for (String word : arr) {
            if (word.contains("e")) {
                value += word + "/";

            }
        }


        String[] fewValues = value.split("/");
        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }


}

