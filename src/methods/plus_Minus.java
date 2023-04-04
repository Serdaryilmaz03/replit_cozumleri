package methods;

import java.util.Scanner;

public class plus_Minus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = inp.nextInt();
        }

        plus_Minus(arr);
    }

    public static int[] plus_Minus(int[] nums) {
        int psitives = 0;
        int negatives = 0;
        int zeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                psitives++;
            } else if (nums[i] < 0) {
                negatives++;
            } else if (nums[i] == 0) {
                zeros++;
            }
        }
        System.out.println("positives:" + psitives + "negatives:" + negatives + "zeros:" + zeros);
        return nums;
    }


}
