package strings;

import java.util.Locale;
import java.util.Scanner;

public class email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int underscoreindex=email.indexOf("_");
        int pointindex=email.indexOf(".");
        int atsighnindex=email.indexOf("@");
        String firstname=email.substring(0,underscoreindex);
        String lastname=email.substring(underscoreindex+1,atsighnindex);
        String domain=email.substring(atsighnindex+1,pointindex);
        String firstnameuppercase=firstname.toUpperCase().charAt(0)+firstname.substring(1);
        String lastnameuppercase=lastname.toUpperCase().charAt(0)+lastname.substring(1);
        System.out.println("First name: "+firstnameuppercase);
        System.out.println("Last name: "+lastnameuppercase);
        System.out.println("Domain: "+domain);





    }
}
