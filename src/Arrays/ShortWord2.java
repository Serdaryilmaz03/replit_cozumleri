package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShortWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] word=str.split(", ");


       String shortword=word[0];


        for (String currentword:word) {
            if (currentword.length()<shortword.length()){
                shortword=currentword;
            }

        }
        String allshorts="";
        for (String currentword:word) {
            if (currentword.length()==shortword.length()){
              allshorts+=currentword+"/";
            }

        }

        String[] arr=allshorts.split("/");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



        }
    }
