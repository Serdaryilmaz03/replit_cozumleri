package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class removeAllArrayList {
    public static ArrayList<String> removeAll(ArrayList<String> words, String targetWord) {

        ArrayList<String > target=new ArrayList<>();
        target.add(targetWord);
        words.removeAll(target);

        return words;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String target = in.next();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeAll(list, target));

    }


}
