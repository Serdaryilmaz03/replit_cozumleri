package methods.overLoading;

import java.util.Arrays;

public class methodsWith2DArrays {

    public static int[][] scalar(int[][] matrix ,int n) {
        int newMatrix[][]=matrix.clone();

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j< 3;j++){
newMatrix[i][j]*=2;
            }

        }
        return newMatrix;

    }

    public static void main(String[] args)
    {

        int [][] i= new int[][]
                {
                        {2,3,5},
                        {1,1,2}
                };
        i = scalar(i,5);
        System.out.println(Arrays.deepToString( i ));

    }//end Main
}