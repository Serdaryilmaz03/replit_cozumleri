package Arrays;

import java.util.Scanner;

public class has55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO Type your code below:
        int counter = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 5 && nums[i + 1] == 5) {
                counter++;
            }
        }
        System.out.println(counter>=1);
    }
}