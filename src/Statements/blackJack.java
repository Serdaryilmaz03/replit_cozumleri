package Statements;

import java.util.Scanner;

public class blackJack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();
        if (house>player&&house<=21){
            System.out.println("player loss");

        }else if (player>house&&player<=21){
            System.out.println("player win");
        }else if (player==house&&player<=21){
            System.out.println("its a tie");
        }else if (player>21){
            System.out.println("player bust");
        }


    }
}
