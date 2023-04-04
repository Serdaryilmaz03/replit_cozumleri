package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class sizeAndGet {
    public static int sum(ArrayList<Integer> nums) {
        //write code here
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {

            sum += nums.get(i);
        }


        return sum;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(sum(list));

    }

}
