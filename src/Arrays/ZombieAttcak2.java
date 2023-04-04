package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttcak2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int day = 0; int i=0;
        while (inhabitants[i] > 0) {



            for (int j = 0; j < 8; j++) {
                inhabitants[i]= inhabitants[i] / 2;

            }
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            day++;
            i++;

        }

        System.out.println("---- EXTINCT ----");


    }
}