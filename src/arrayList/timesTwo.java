package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class timesTwo {
    public static ArrayList<Integer> times2(ArrayList<Integer> nums) {
        ArrayList<Integer> twoTimesnums = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            twoTimesnums.add(nums.get(i) * 2);

        }
        return twoTimesnums;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(times2(list));
    }


}
