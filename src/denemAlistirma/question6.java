package denemAlistirma;

import java.util.Arrays;

public class question6 {
    public static void main(String[] args) {
        int[] x = {1,2,3};
        int[] a = {110,5,98,0,1200,11,-4};
        System.out.println(Arrays.toString(greatest(x)));
        System.out.println(Arrays.toString(greatest(a)));
    }

    public static int[] greatest(int[] num) {
        int[] great = new int[num.length];
        int grnde = num[0];
        for (int i = 0; i < num.length; i++) {
            if (grnde < num[i]) {
                grnde = num[i];
            }
            for (int j = 0; j < num.length; j++) {
                great[j] = grnde;
            }

        }
        return great;
    }
}