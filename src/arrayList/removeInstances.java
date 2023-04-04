package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class removeInstances {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
        for (int i = 0; i < r.size(); i++) {
            if (n == r.get(i)) {
                r.remove(i);
                i--;
            }

        }
        //r.removeAll(Arrays.asList(n));
        //r.removeIf(each -> each==n);
        return r;

    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(removeInst(list, n));

    }


}
