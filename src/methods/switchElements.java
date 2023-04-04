package methods;

import java.util.Arrays;
import java.util.Scanner;

public class switchElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()};
        System.out.printf(Arrays.toString(do_switch(arr)));
        System.out.println(arr);
        String sd = new String("ali");
        System.out.println(sd
        );
    }


    public static int[] do_switch(int[] i) {


        int a = i[0];
        int b = i[i.length - 1];
        i[0] = b;
        i[i.length - 1] = a;
        return i;

    }
}

