package methods;

import java.util.Arrays;
import java.util.Scanner;

public class populateArray {

    public static int[] populate(int[] r) {
        int count=1;
        for (int i=0;i<r.length;i++){
            r[i]=count;
            count++;

        }
return r;

    }

    public static void main(String[] args) 	{
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));

    }
}
