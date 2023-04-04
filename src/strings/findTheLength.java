package strings;

import java.util.Scanner;

public class findTheLength {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the text:");
        String str=scan.nextLine();
        System.out.println("Length is: "+str.length());
    }
}
