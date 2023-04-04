package methods.methodWithArrays;

import java.util.Scanner;

public class getDuplicated__________ {
    public static int getDup(String[] r) {
        int counter=0;
for (int i=0;i<r.length;i++){
    for (int j=0;j<r.length;j++){
        if (r[i].equals(r[j])&& i!=j){
            counter++;
            System.out.println(r[i]+r[j]);
        }
    }

}

return counter;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }

}
