package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class makeLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int[] lastArray = new int[nums.length*2];
        for (int i = 0; i < lastArray.length - 1; i++) {
            lastArray[i] = 0;
        }
        lastArray[lastArray.length - 1] = nums[nums.length - 1];
        System.out.println(Arrays.toString(lastArray));

    }
}

