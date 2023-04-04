package OOP.TEST19;

import OOP.TEST21.Board;
import OOP.TEST21.PositionManager;
import OOP.TEST21.TestData;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int data = in.nextInt();
        String[][] br = TestData.getBoard(data);
        PositionManager pm = new PositionManager(br);

        System.out.println(pm.isValidPos(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()));

        pm.placeShip(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
        System.out.println(Arrays.deepToString(pm.boardR));

        if(data == 2) {

            Board b = new Board(pm.boardR);
            System.out.println(b.isDestroyed());
            System.out.println(b.hit(in.nextInt(), in.nextInt()));
            System.out.println(b.hit(in.nextInt(), in.nextInt()));
            System.out.println(b.isDestroyed());

        }


    }//end main
}
