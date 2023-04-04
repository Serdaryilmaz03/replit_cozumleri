package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LaegestNumber2DArray {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        int maxarr=arr[0][0];
        for(int i=0 ;i<=rows-1;i++){

            for(int j=0 ;j<=cols-1;j++){
                arr[i][j]=inp.nextInt();
                if (maxarr<arr[i][j]){
                    maxarr=arr[i][j];

                }

            }//end for cols
        }//end for rows

arr[rows][cols]=maxarr;
        System.out.println(Arrays.deepToString(arr));

    }
}
