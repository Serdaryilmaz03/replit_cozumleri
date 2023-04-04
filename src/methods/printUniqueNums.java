package methods;

import java.util.Scanner;

public class printUniqueNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE
        for (int i = 0; i < nums.length; i++) {
            boolean unique = true;

            for (int j = 1; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    unique = false;
                    break;
                }

            }
            if (unique) {
                System.out.println(nums[i]);
            }
        }

    }
}

