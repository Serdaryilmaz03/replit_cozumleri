package loops;

import java.util.Scanner;

public class zombieAttack1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int inhabitants=scan.nextInt();
        int day=0;
      do {
            System.out.println("Day "+day+" ["+inhabitants+"]");
            inhabitants=inhabitants/2;
            day++;
        }while (inhabitants>=1);{

        }
        System.out.println("---- EXTINCT ----");
    }
}
