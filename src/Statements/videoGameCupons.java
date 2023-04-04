package Statements;

import java.util.Scanner;

public class videoGameCupons {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of coupons");
        int coupons=scanner.nextInt();
        if (coupons<3){
        System.out.println("Not enough coupons");
        }else if (coupons>3){
            int Candiles=coupons/10;
            int Guballs=(coupons%10)/3;
            System.out.println("Number of Candies:"+Candiles);
            System.out.println("Number of Gumballs:"+Guballs);
        }
    }
}
