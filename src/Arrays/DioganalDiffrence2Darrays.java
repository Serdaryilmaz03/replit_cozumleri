package Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DioganalDiffrence2Darrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{{scan.nextInt(), scan.nextInt(), scan.nextInt()}, {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        int result = 0;
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    diag1 += matrix[i][j];
                    System.out.println(diag1);

                }
            }
        }
        int counter1 = 0;
        int counter2 = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == counter1 && j == counter2) {
                    diag2 += matrix[i][j];
                    counter1++;
                    counter2--;


                }
            }
        }
        result = diag1 - diag2;
        System.out.println(result);
    }
}





