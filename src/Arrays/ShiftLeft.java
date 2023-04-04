package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int[] shitnums=new int[size];
        for(int i = 0; i < size-1; i++){
            shitnums[i]=nums[i+1];

        }
        shitnums[size-1]=nums[0];
        System.out.println(Arrays.toString(shitnums));

    }
}

