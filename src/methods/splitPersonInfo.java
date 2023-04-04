package methods;

import java.util.Scanner;

public class splitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {
        //your code here


String[] arr=info.split(",");

        System.out.println("person name: "+arr[0]);
        System.out.println("person surname: "+arr[1]);
        System.out.println("age: "+arr[2]);

    }

}
