package OOP.TEST21;

public class PositionManager {
    public String[][] boardR;//board array

    private String[] shipTypes = new String[]{"ss", "m", "dddd", "ccc"};

    public PositionManager(String[][] br) {
        boardR = br;

    }//end constructor

    public boolean placeShip(int row, int column, int dir, int shipT) {
        // TODO:

        boardR = new String[row][column];


        return true;
    }//end place_ship


    public boolean isValidPos(int row, int column, int dir, int len) {
        // TODO:


        return true;
    }//end isValidPos

}

