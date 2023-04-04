package denemAlistirma;

import java.util.Arrays;

public class calisma {
    public static void main(String[] args) {
        String db="1etsy#2wooden#3spoon";
        String op="add";
         String id="4";
         String data="aaa";;
        String[] arr=db.split("#");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        String str=arr[0]+arr[1];
        System.out.println(str);
    }
    public class Main {
        public static void main(String[] args) {
            System.out.println("hello world");
        }
    }
}