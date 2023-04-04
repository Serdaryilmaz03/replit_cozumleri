package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class searchArrayList {

    public static String search(ArrayList<String> r, String find) {
        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains(find)){
                return r.get(i);
            }

            }



        return "search failed";



    }//end wineSeller


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }

}