package strings;

import java.util.Scanner;

public class email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
if (email.contains("_")){
    int uderscoreindex=email.indexOf("_");
    int atsignindex=email.indexOf("@");
    System.out.println(email.substring(uderscoreindex+1,atsignindex)+"_"+email.substring(0,uderscoreindex)+email.substring(atsignindex,email.length()));

}else {
    System.out.println(email);
}
    }
}