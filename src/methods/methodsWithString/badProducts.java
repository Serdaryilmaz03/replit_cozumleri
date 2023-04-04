package methods.methodsWithString;

import java.util.Scanner;

public class badProducts {
    public static boolean badP(int[] products, int limit) {
        int counter = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == 0) {
                counter++;
            }
        }if (counter<=limit){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int limit = in.nextInt();

        System.out.println(badP(nums, limit));
    }

}
