package denemAlistirma;

import java.util.Arrays;

public class task95 {
    public static void main(String[] args) {
        int[][] scores = {{68, 75, 54, 80,},
                         {100, 64, 20, 50},
                         {10, 35, 40, 90}};
        double sdnt1av;
        int []stdnt = scores[0];
        int sum=0;
        for(int i=0;i<4;i++){
            sum=sum+stdnt[i];

        }
       sdnt1av=sum/4;
        System.out.println(sdnt1av);
        int summath=0;
        for (int i=0;i<3;i++){

                summath = summath+scores[i][0];

        }
        System.out.println(summath);
        }
    }

