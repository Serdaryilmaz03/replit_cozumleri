package methods;

import java.util.Scanner;

public class timeConversion {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
         timeConversion(scan.nextLine());
        }

        public static void timeConversion (String s){
        /*
         * Write your code here.
         */
s.trim();
        if (s.equals("12:00:00AM")) {
            System.out.println("00:00:00");
        } else if (s.equals("12:00:00PM")) {
            System.out.println("12:00:00");

        } else if (s.endsWith("AM")) {
            int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
            s = s.replace("AM", "");
            if (hour == 12) {
                s = "00" + s.substring(2);
            }
            System.out.println(s);

        } else if (s.endsWith("PM")) {
            int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
            hour += 12;
            String time=hour+s.substring(s.indexOf(":")).replace("pm","");
            System.out.println(time);
        }


    }
}
