package OOP.TEST21;

public class Board {
    private String[][] boardR;//board array
    private boolean destroyed;
    private String[] shipTypes = new String[]{"s", "m", "d", "c"};

    public Board(String[][] boardR) {
        this.boardR = boardR;
        // TODO:
    } //end constructor

    public boolean hit(int row, int column) {

        // TODO:


        return false;
    }//end hit

    public boolean isDestroyed() {
        // TODO:


        return false;
    }//end isDestroyed

    public String[][] getBoardR() {
        return boardR;
    }

}
