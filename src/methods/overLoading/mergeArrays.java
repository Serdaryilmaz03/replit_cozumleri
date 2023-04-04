package methods.overLoading;

import java.util.Arrays;
import java.util.Scanner;

public class mergeArrays {

    public static int[] mergR(int[] a,int[] b) {
        int[] merg=new int[a.length+ b.length];
        for (int i=0;i< a.length;i++){
            merg[i]=a[i];
        }
        for (int i=0;i< b.length;i++) {
            merg[i + a.length] = b[i];

        }



return merg;

    }//end mergR

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(mergR(nums, nums2)));
    }
}