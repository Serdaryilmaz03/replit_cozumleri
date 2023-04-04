package methods.methodsWithReturn;

import java.util.Scanner;

public class simpleRoomBooking {
    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
        // your code here
        if (year != 2018) {
            return false;
        } else if (month == 7 && day >= 1 && day <= 8) {
            return false;
        } else if (isAvailable==false){
            return false;
        }else {
            return true;
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }
}
