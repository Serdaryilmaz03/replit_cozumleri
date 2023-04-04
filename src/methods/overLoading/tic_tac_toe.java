package methods.overLoading;

import java.util.Scanner;

public class tic_tac_toe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] game = new char[9];
        for (int i = 0; i < game.length; i++) {
            game[i] = in.next().charAt(0);
        }

        System.out.println(won(game));
    }


    public static String won(char[] x) {
        String winner = "Player X won";
        String winzero = "Player O won";

            if (x[0] == 'X' && x[1] == 'X' && x[2] == 'X') {
                return winner;

            } else if (x[6] == 'X' && x[7] == 'X' && x[8] == 'X') {
                return winner;
            } else if (x[3] == 'X' && x[4] == 'X' && x[5] == 'X') {
                return winner;
            } else if (x[0] == 'X' && x[3] == 'X' && x[6] == 'X') {
                return winner;
            } else if (x[1] == 'X' && x[4] == 'X' && x[7] == 'X') {
                return winner;
            } else if (x[2] == 'X' && x[5] == 'X' && x[8] == 'X') {
                return winner;
            }else
        return winzero;

    }

}