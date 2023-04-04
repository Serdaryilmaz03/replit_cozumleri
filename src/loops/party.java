package loops;

import java.util.Scanner;

public class party {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name,answer,guestlist="";
        do {
            System.out.println("Please enter guest name");
            name = input.next();
guestlist=guestlist+name;
            System.out.println("Do you want to enter new guest name:");
            answer = input.next();
            if (answer.equals("yes")){
                guestlist=guestlist+", ";
            }
        } while (answer.equalsIgnoreCase("yes"));{


            System.out.println("Guest's list: "+guestlist);

    }
    }
}
