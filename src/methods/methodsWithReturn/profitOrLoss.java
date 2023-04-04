package methods.methodsWithReturn;

import java.util.Scanner;

public class profitOrLoss {
    public static String profits(int buyPrice,int sellPrice){
        //your code here
String str1="profit";
String str2="loss";
String str3="no loss";
if (buyPrice==sellPrice){
    return str3;
}else if (buyPrice>sellPrice){
    return str2;
}else {
    return str1;
}



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
    }

}
