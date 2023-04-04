package denemAlistirma;

import java.util.Arrays;

public class question4 {
    public static void main(String[] args) {
        int[] y = {17, 12, 10, 8};
        System.out.println(Arrays.toString(rotteArray(y)));
    }

    public static int[] rotteArray(int[] x) {

        int[] c = new int[x.length];
        for (int i = 1; i < x.length; i++) {

            c[i - 1] = x[i];

        }
        c[c.length - 1] = x[0];
        return c;
    }
}