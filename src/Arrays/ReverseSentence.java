package Arrays;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        String[] splitsentence =sentence.split(" ");
        for (int i=splitsentence.length-1;i>=0;i--){
            reversed=reversed+splitsentence[i]+" ";
        }
        reversed=reversed.trim();
        System.out.println(reversed);
    }
}
