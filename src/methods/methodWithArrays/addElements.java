package methods.methodWithArrays;

import java.util.Arrays;
import java.util.Scanner;

public class addElements {

    public static int[] addElements(int[] ints1, int[] ints2) {
        if (ints1.length >= ints2.length) {
            int[] adedeArray = new int[ints1.length];
            for (int i = 0; i < ints1.length; i++) {
                adedeArray[i] = ints1[i] + ints2[i];
            }
            return adedeArray;
        } else {
            int[] adedeArray = new int[ints1.length];
            for (int i = 0; i < ints2.length; i++) {

                adedeArray[i] = ints1[i] + ints2[i];

            }
return adedeArray;

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        int[] nums2 = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(addElements(nums, nums2)));
    }

}