package denemAlistirma;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task94 {
    public static void main(String[] args) {
        String info1 ="his info is used for creation password : xxxCD132Gxxx . Please do not share with \n" +
                "anyone";
        String info2="This info is used for creation password : xxx00ABC!xxx . Please do not share with \n" +
                "anyone";
        String[] infoArray1 = info1.split("password :");
        String[] infoArray2 = info2.split("password :");

        System.out.println(Arrays.toString(infoArray1));


        String pass1 = infoArray1[1].split(". Please")[0];
        System.out.println(pass1);

        System.out.println(Arrays.toString(infoArray1[1].split(". Please")));


        String pass2 = infoArray2[1].split(". Please")[0];

        pass1 = pass1.substring(4, 10);
        pass2 = pass2.substring(4, 10);


        System.out.println(pass1.trim() + pass2.trim());

    }
}