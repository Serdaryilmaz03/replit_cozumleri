package loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
int output=1;
        for (int x=1;x<=n;x++){
            output=output*x;

        }
        System.out.println(output);

    }
}